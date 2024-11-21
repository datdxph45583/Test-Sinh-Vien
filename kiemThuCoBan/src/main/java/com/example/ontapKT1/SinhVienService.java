package com.example.ontapKT1;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> list = new ArrayList<>();
    public List<SinhVien> getList() {
        return list;
    }

    public int addSV(SinhVien sinhvien) {
        if (sinhvien.getMaSV().isEmpty() || sinhvien.getTen().isEmpty() || sinhvien.getChuyenNganh().isEmpty() ||
                sinhvien.getTuoi()==null || sinhvien.getDiemTrungBinh()==null || sinhvien.getKyHoc()==null) {
            throw new NullPointerException("Khong duoc de trong");
        }  else {
            list.add(sinhvien);
            return list.size();
        }
    }
    public void deleteSV(String ma) {
        if (list.removeIf(mayTinh -> mayTinh.getMaSV() == ma)){
            System.out.println("Xoa thanh cong sinh vien: " + ma);
        }else {
            System.out.println("Khong tim thay sinh vien: "+ma);
        }
    }
}
