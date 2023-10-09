package com.example.demo4.Dao;
//
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.example.demo4.entity.BenhNhan;
import com.example.demo4.util.DbHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BenhNhanDao {
    private Connection connection;

    public BenhNhanDao() {
        connection = DbHelper.getConnection();
    }

    public void addBenhNhan(BenhNhan benhNhan) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO benh_nhan(HO_TEN, NGAY_SINH, GIOI_TINH, DIA_CHI, MA_THE, MA_DKBD) VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, benhNhan.getHoTen());
            preparedStatement.setString(2, benhNhan.getNgaySinh());
            preparedStatement.setInt(3, benhNhan.getGioiTinh());
            preparedStatement.setString(4, benhNhan.getDiaChi());
            preparedStatement.setString(5, benhNhan.getMaThe());
            preparedStatement.setString(6, benhNhan.getMaDkbd());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBenhNhan(BenhNhan benhNhan) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("UPDATE benh_nhan SET HO_TEN=?, NGAY_SINH=?, GIOI_TINH=?, DIA_CHI=?, MA_THE=?, MA_DKBD=? WHERE BN_ID=?");
            preparedStatement.setString(1, benhNhan.getHoTen());
            preparedStatement.setString(2, benhNhan.getNgaySinh());
            preparedStatement.setInt(3, benhNhan.getGioiTinh());
            preparedStatement.setString(4, benhNhan.getDiaChi());
            preparedStatement.setString(5, benhNhan.getMaThe());
            preparedStatement.setString(6, benhNhan.getMaDkbd());
            preparedStatement.setInt(7, benhNhan.getBnId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBenhNhan(int bnId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("DELETE FROM benh_nhan WHERE BN_ID=?");
            preparedStatement.setInt(1, bnId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<BenhNhan> getAllBenhNhan() {
        ObservableList<BenhNhan> benhNhanList = FXCollections.observableArrayList();
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM benh_nhan");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                BenhNhan benhNhan = new BenhNhan();
                benhNhan.setBnId(rs.getInt("BN_ID"));
                benhNhan.setHoTen(rs.getString("HO_TEN"));
                benhNhan.setNgaySinh(rs.getString("NGAY_SINH"));
                benhNhan.setGioiTinh(rs.getInt("GIOI_TINH"));
                benhNhan.setDiaChi(rs.getString("DIA_CHI"));
                benhNhan.setMaThe(rs.getString("MA_THE"));
                benhNhan.setMaDkbd(rs.getString("MA_DKBD"));
                benhNhanList.add(benhNhan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return benhNhanList;
    }

    public BenhNhan getBenhNhanById(int bnId) {
        BenhNhan benhNhan = new BenhNhan();
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM benh_nhan WHERE BN_ID=?");
            preparedStatement.setInt(1, bnId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                benhNhan.setBnId(rs.getInt("BN_ID"));
                benhNhan.setHoTen(rs.getString("HO_TEN"));
                benhNhan.setNgaySinh(rs.getString("NGAY_SINH"));
                benhNhan.setGioiTinh(rs.getInt("GIOI_TINH"));
                benhNhan.setDiaChi(rs.getString("DIA_CHI"));
                benhNhan.setMaThe(rs.getString("MA_THE"));
                benhNhan.setMaDkbd(rs.getString("MA_DKBD"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return benhNhan;
    }
}