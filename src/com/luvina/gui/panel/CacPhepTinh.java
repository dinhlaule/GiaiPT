package com.luvina.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.luvina.IAnHien.IAnHien;
import com.luvina.gui.icommon.ICommon;
import com.luvina.logic.Common;
import com.luvina.logic.PhepTinh;

public class CacPhepTinh extends JPanel implements ICommon {
	private IAnHien event;
	private JLabel lbTitle, lbSoA, lbSoB, lbKetQua;
	private JTextField tfSoA, tfSoB, tfKetQua;
	private JButton btTong, btHieu, btTich, btThuong, btBack;

	public void addEventCacPhepTinh(IAnHien event) {
		this.event = event;
	}

	public CacPhepTinh() {
		init();
		addComponent();
		addEvent();
	}

	@Override
	public void init() {
		setLayout(null);
		setVisible(true);

	}

	@Override
	public void addComponent() {
		// khởi tạo đối ượng lbTitle
		lbTitle = new JLabel();
		// set giá trị hiển thị của lable
		lbTitle.setText("Giải Phương trình bậc nhất");
		// set vị trí
		lbTitle.setBounds(20, 20, 400, 50);
		// set màu
		lbTitle.setForeground(Color.DARK_GRAY);
		// set phông chữ
		lbTitle.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối tượng lbSoA
		lbSoA = new JLabel();
		// set giá trị hiển thị của lable
		lbSoA.setText("Nhập a :");
		// set vị trí
		lbSoA.setBounds(20, 80, 200, 50);
		// set màu
		lbSoA.setForeground(Color.DARK_GRAY);
		// set phông chữ
		lbSoA.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối tượng lbSob
		lbSoB = new JLabel();
		// set giá trị hiển thị của lable
		lbSoB.setText("Nhập b :");
		// set vị trí
		lbSoB.setBounds(20, 140, 200, 50);
		// set màu
		lbSoB.setForeground(Color.DARK_GRAY);
		// set phông chữ
		lbSoB.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối tượng lbKetQua
		lbKetQua = new JLabel();
		// set giá trị hiển thị của lable
		lbKetQua.setText("Kết Quả :");
		// set vị trí
		lbKetQua.setBounds(20, 200, 200, 50);
		// set màu
		lbKetQua.setForeground(Color.DARK_GRAY);
		// set phông chữ
		lbKetQua.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối tượng tfSoA
		tfSoA = new JTextField();
		// set giá trị hiển thị của lable
		tfSoA.setText("");
		// set vị trí
		tfSoA.setBounds(140, 80, 200, 40);
		// set màu
		tfSoA.setForeground(Color.DARK_GRAY);
		// set phông chữ
		tfSoA.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối tượng tfSoB
		tfSoB = new JTextField();
		// set giá trị hiển thị của lable
		tfSoB.setText("");
		// set vị trí
		tfSoB.setBounds(140, 140, 200, 40);
		// set màu
		tfSoB.setForeground(Color.DARK_GRAY);
		// set phông chữ
		tfSoB.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối tượng tfKetQua
		tfKetQua = new JTextField();
		// set giá trị hiển thị của lable
		tfKetQua.setText("");
		// set vị trí
		tfKetQua.setBounds(140, 200, 200, 40);
		// set màu
		tfKetQua.setForeground(Color.DARK_GRAY);
		// set phông chữ
		tfKetQua.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối ượng btTinh
		btTong = new JButton();
		// set giá trị hiển thị của lable
		btTong.setText("Tổng");
		// set vị trí
		btTong.setBounds(40, 250, 150, 40);
		// set màu
		btTong.setForeground(Color.BLACK);
		// set phông chữ
		btTong.setFont(new Font("Arial", Font.PLAIN, 20));

		// khởi tạo đối ượng btTinh
		btHieu = new JButton();
		// set giá trị hiển thị của lable
		btHieu.setText("Hiệu");
		// set vị trí
		btHieu.setBounds(200, 250, 150, 40);
		// set màu
		btHieu.setForeground(Color.BLACK);
		// set phông chữ
		btHieu.setFont(new Font("Arial", Font.PLAIN, 20));

		// khởi tạo đối ượng btTinh
		btTich = new JButton();
		// set giá trị hiển thị của lable
		btTich.setText("Tích");
		// set vị trí
		btTich.setBounds(40, 300, 150, 40);
		// set màu
		btTich.setForeground(Color.BLACK);
		// set phông chữ
		btTich.setFont(new Font("Arial", Font.PLAIN, 20));

		// khởi tạo đối ượng btTinh
		btThuong = new JButton();
		// set giá trị hiển thị của lable
		btThuong.setText("Thương");
		// set vị trí
		btThuong.setBounds(200, 300, 150, 40);
		// set màu
		btThuong.setForeground(Color.BLACK);
		// set phông chữ
		btThuong.setFont(new Font("Arial", Font.PLAIN, 20));

		// khởi tạo đối ượng btTinh
		btBack = new JButton();
		// set giá trị hiển thị của lable
		btBack.setText("Back");
		// set vị trí
		btBack.setBounds(125, 400, 150, 40);
		// set màu
		btBack.setForeground(Color.BLACK);
		// set phông chữ
		btBack.setFont(new Font("Arial", Font.PLAIN, 20));

		// add component vào panel
		add(lbTitle);
		add(lbSoA);
		add(lbSoB);
		add(lbKetQua);
		add(tfSoA);
		add(tfSoB);
		add(tfKetQua);
		add(btTong);
		add(btHieu);
		add(btTich);
		add(btThuong);
		add(btBack);

	}

	@Override
	public void addEvent() {
		// xử lý buton tong
		ActionListener tong = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String giaTriA = tfSoA.getText();
				String giaTriB = tfSoB.getText();
				double soA = Common.convertStringToDouble(giaTriA, 0);
				double soB = Common.convertStringToDouble(giaTriB, 0);

				PhepTinh phepTinh = new PhepTinh(soA, soB);
				String kq = phepTinh.tinhTong();
				tfKetQua.setText(kq);

			}
		};
		btTong.addActionListener(tong);
		// xử lý buton hieu
		ActionListener hieu = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String giaTriA = tfSoA.getText();
				String giaTriB = tfSoB.getText();
				double soA = Common.convertStringToDouble(giaTriA, 0);
				double soB = Common.convertStringToDouble(giaTriB, 0);

				PhepTinh phepTinh = new PhepTinh(soA, soB);
				String kq = phepTinh.tinhHieu();
				tfKetQua.setText(kq);

			}
		};
		btHieu.addActionListener(hieu);
		// xử lý buton tich
		ActionListener tich = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String giaTriA = tfSoA.getText();
				String giaTriB = tfSoB.getText();
				double soA = Common.convertStringToDouble(giaTriA, 0);
				double soB = Common.convertStringToDouble(giaTriB, 0);

				PhepTinh phepTinh = new PhepTinh(soA, soB);
				String kq = phepTinh.tinhTich();
				tfKetQua.setText(kq);

			}
		};
		btTich.addActionListener(tich);
		// xử lý buton thuong
		ActionListener thuong = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String giaTriA = tfSoA.getText();
				String giaTriB = tfSoB.getText();
				double soA = Common.convertStringToDouble(giaTriA, 0);
				double soB = Common.convertStringToDouble(giaTriB, 0);

				PhepTinh phepTinh = new PhepTinh(soA, soB);
				String kq = phepTinh.tinhThuong();
				tfKetQua.setText(kq);

			}
		};
		btThuong.addActionListener(thuong);
		// xử lý buton back
		ActionListener back = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				event.anMainPanel();

			}
		};
		btBack.addActionListener(back);

	}

}
