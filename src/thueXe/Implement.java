package thueXe;

import dataase.Connector;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;
public class Implement  {


    public void dienThongTinKhachHang() throws IOException {
        Parent dienThongTinKhachHang = FXMLLoader.load(getClass().getResource("thongTinKhachHang.fxml"));
        Main.rootStage.setTitle("Điền Thông Tin Khách Hàng");
        Scene sc = new Scene(dienThongTinKhachHang, 800, 600);
        Main.rootStage.setScene(sc);
    }
        public void dienThongTinThueXe() throws IOException {
                Parent dienThongTinThueXe = FXMLLoader.load(getClass().getResource("billThueXe.fxml"));
                Main.rootStage.setTitle("Điền Thông Tin Thuê Xe");
                Scene sc = new Scene(dienThongTinThueXe,800,600);
                Main.rootStage.setScene(sc);
            }

    public void traXe() throws IOException {
            Parent traXe = FXMLLoader.load(getClass().getResource("traXe.fxml"));
            Main.rootStage.setTitle("Trả Xe");
            Scene sc = new Scene(traXe,800,600);
            Main.rootStage.setScene(sc);
    }

    public void thongTinXe() throws IOException {
        Parent traXe = FXMLLoader.load(getClass().getResource("thongTinXe.fxml"));
        Main.rootStage.setTitle("Trả Xe");
        Scene sc = new Scene(traXe,800,600);
        Main.rootStage.setScene(sc);

    }
    public void thongTinKhachHang() throws IOException {
        Parent traXe = FXMLLoader.load(getClass().getResource("viewThongTinKhachHang.fxml"));
        Main.rootStage.setTitle("Trả Xe");
        Scene sc = new Scene(traXe,800,600);
        Main.rootStage.setScene(sc);

    }

    public void thongTinThueXe() throws IOException {
        Parent traXe = FXMLLoader.load(getClass().getResource("viewBillThueXe.fxml"));
        Main.rootStage.setTitle("Trả Xe");
        Scene sc = new Scene(traXe,800,600);
        Main.rootStage.setScene(sc);

    }

}
