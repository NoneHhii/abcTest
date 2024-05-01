package Test;

import java.util.ArrayList;

import DAO.SuatChieu_DAO;
import View.GUI_Main;
import entity.SuatChieu;

public class Main {
    public static void main(String[] args) {
		ArrayList<SuatChieu> list = new ArrayList<>();
		SuatChieu_DAO suatChieu_DAO = new SuatChieu_DAO();
		
		list = suatChieu_DAO.getDSSuatChieu();
		
		for (SuatChieu suatChieu : list) {
			System.out.println(suatChieu);
		}
	}
}
