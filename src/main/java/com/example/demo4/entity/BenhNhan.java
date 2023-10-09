package com.example.demo4.entity;


import javafx.beans.property.*;

import java.util.Date;

public class BenhNhan {
    private IntegerProperty bnId;
    private StringProperty hoTen;
    private StringProperty ngaySinh;
    private IntegerProperty gioiTinh;
    private StringProperty diaChi;
    private StringProperty maThe;
    private StringProperty maDkbd;
    private StringProperty gtTheTu;
    private StringProperty gtTheDen;
    private StringProperty ngayCap;
    private StringProperty maQuanLy;
    private StringProperty tenChaMe;
    private IntegerProperty maDtSong;
    private StringProperty thoiDiemNamNam;
    private StringProperty chuoiKiemTra;
    private ObjectProperty<Date> dateAdd;
    private ObjectProperty<Date> lastEdit;
    private StringProperty gateInfo;
    private IntegerProperty sts;

    public BenhNhan() {
        bnId = new SimpleIntegerProperty();
        hoTen = new SimpleStringProperty();
        ngaySinh = new SimpleStringProperty();
        gioiTinh = new SimpleIntegerProperty();
        diaChi = new SimpleStringProperty();
        maThe = new SimpleStringProperty();
        maDkbd = new SimpleStringProperty();
        gtTheTu = new SimpleStringProperty();
        gtTheDen = new SimpleStringProperty();
        ngayCap = new SimpleStringProperty();
        maQuanLy = new SimpleStringProperty();
        tenChaMe = new SimpleStringProperty();
        maDtSong = new SimpleIntegerProperty();
        thoiDiemNamNam = new SimpleStringProperty();
        chuoiKiemTra = new SimpleStringProperty();
        dateAdd = new SimpleObjectProperty<>();
        lastEdit = new SimpleObjectProperty<>();
        gateInfo = new SimpleStringProperty();
        sts = new SimpleIntegerProperty();
    }

    // bnId Property
    public IntegerProperty bnIdProperty() {
        return bnId;
    }

    public Integer getBnId() {
        return bnId.get();
    }

    public void setBnId(Integer bnId) {
        this.bnId.set(bnId);
    }

    // hoTen Property
    public StringProperty hoTenProperty() {
        return hoTen;
    }

    public String getHoTen() {
        return hoTen.get();
    }

    public void setHoTen(String hoTen) {
        this.hoTen.set(hoTen);
    }

    // ngaySinh Property
    public StringProperty ngaySinhProperty() {
        return ngaySinh;
    }

    public String getNgaySinh() {
        return ngaySinh.get();
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh.set(ngaySinh);
    }

    // gioiTinh Property
    public IntegerProperty gioiTinhProperty() {
        return gioiTinh;
    }

    public Integer getGioiTinh() {
        return gioiTinh.get();
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh.set(gioiTinh);
    }

    // diaChi Property
    public StringProperty diaChiProperty() {
        return diaChi;
    }

    public String getDiaChi() {
        return diaChi.get();
    }

    public void setDiaChi(String diaChi) {
        this.diaChi.set(diaChi);
    }

    // maThe Property
    public StringProperty maTheProperty() {
        return maThe;
    }

    public String getMaThe() {
        return maThe.get();
    }

    public void setMaThe(String maThe) {
        this.maThe.set(maThe);
    }

    // maDkbd Property
    public StringProperty maDkbdProperty() {
        return maDkbd;
    }

    public String getMaDkbd() {
        return maDkbd.get();
    }

    public void setMaDkbd(String maDkbd) {
        this.maDkbd.set(maDkbd);
    }

    // gtTheTu Property
    public StringProperty gtTheTuProperty() {
        return gtTheTu;
    }

    public String getGtTheTu() {
        return gtTheTu.get();
    }

    public void setGtTheTu(String gtTheTu) {
        this.gtTheTu.set(gtTheTu);
    }

    // gtTheDen Property
    public StringProperty gtTheDenProperty() {
        return gtTheDen;
    }

    public String getGtTheDen() {
        return gtTheDen.get();
    }

    public void setGtTheDen(String gtTheDen) {
        this.gtTheDen.set(gtTheDen);
    }

    // ngayCap Property
    public StringProperty ngayCapProperty() {
        return ngayCap;
    }

    public String getNgayCap() {
        return ngayCap.get();
    }

    public void setNgayCap(String ngayCap) {
        this.ngayCap.set(ngayCap);
    }

    // maQuanLy Property
    public StringProperty maQuanLyProperty() {
        return maQuanLy;
    }

    public String getMaQuanLy() {
        return maQuanLy.get();
    }

    public void setMaQuanLy(String maQuanLy) {
        this.maQuanLy.set(maQuanLy);
    }

    // tenChaMe Property
    public StringProperty tenChaMeProperty() {
        return tenChaMe;
    }

    public String getTenChaMe() {
        return tenChaMe.get();
    }

    public void setTenChaMe(String tenChaMe) {
        this.tenChaMe.set(tenChaMe);
    }

    // maDtSong Property
    public IntegerProperty maDtSongProperty() {
        return maDtSong;
    }

    public Integer getMaDtSong() {
        return maDtSong.get();
    }

    public void setMaDtSong(Integer maDtSong) {
        this.maDtSong.set(maDtSong);
    }

    // thoiDiemNamNam Property
    public StringProperty thoiDiemNamNamProperty() {
        return thoiDiemNamNam;
    }

    public String getThoiDiemNamNam() {
        return thoiDiemNamNam.get();
    }

    public void setThoiDiemNamNam(String thoiDiemNamNam) {
        this.thoiDiemNamNam.set(thoiDiemNamNam);
    }

    // chuoiKiemTra Property
    public StringProperty chuoiKiemTraProperty() {
        return chuoiKiemTra;
    }

    public String getChuoiKiemTra() {
        return chuoiKiemTra.get();
    }

    public void setChuoiKiemTra(String chuoiKiemTra) {
        this.chuoiKiemTra.set(chuoiKiemTra);
    }

    // dateAdd Property
    public ObjectProperty<Date> dateAddProperty() {
        return dateAdd;
    }

    public Date getDateAdd() {
        return dateAdd.get();
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd.set(dateAdd);
    }

    // lastEdit Property
    public ObjectProperty<Date> lastEditProperty() {
        return lastEdit;
    }

    public Date getLastEdit() {
        return lastEdit.get();
    }

    public void setLastEdit(Date lastEdit) {
        this.lastEdit.set(lastEdit);
    }

    // gateInfo Property
    public StringProperty gateInfoProperty() {
        return gateInfo;
    }

    public String getGateInfo() {
        return gateInfo.get();
    }

    public void setGateInfo(String gateInfo) {
        this.gateInfo.set(gateInfo);
    }

    // sts Property
    public IntegerProperty stsProperty() {
        return sts;
    }

    public Integer getSts() {
        return sts.get();
    }

    public void setSts(Integer sts) {
        this.sts.set(sts);
    }
}
