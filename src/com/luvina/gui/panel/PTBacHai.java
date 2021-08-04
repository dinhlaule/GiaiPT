package com.luvina.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.luvina.IAnHien.IAnHien;
import com.luvina.gui.icommon.ICommon;
import com.luvina.logic.Common;
import com.luvina.logic.PhuongTrinhBacHai;

public class PTBacHai extends JPanel implements ICommon {
	private IAnHien event;
	private JLabel lbTitle, lbSoA, lbSoB, lbSoC, lbKetQua;
	private JTextField tfSoA, tfSoB, tfSoC;
	private JButton btTinh, btBack;
	private JTextArea taKetQua;

	public void addEventPTBH(IAnHien event) {
		this.event = event;
	}

	public PTBacHai() {
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
		lbTitle.setText("Giải Phương trình bậc hai");
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
		lbSoC = new JLabel();
		// set giá trị hiển thị của lable
		lbSoC.setText("Nhập c :");
		// set vị trí
		lbSoC.setBounds(20, 200, 200, 50);
		// set màu
		lbSoC.setForeground(Color.DARK_GRAY);
		// set phông chữ
		lbSoC.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối tượng lbKetQua
		lbKetQua = new JLabel();
		// set giá trị hiển thị của lable
		lbKetQua.setText("Kết Quả :");
		// set vị trí
		lbKetQua.setBounds(20, 300, 200, 30);
		// set màu
		lbKetQua.setForeground(Color.DARK_GRAY);
		// set phông chữ
		lbKetQua.setFont(new Font("Arial", Font.BOLD, 20));

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
		tfSoC = new JTextField();
		// set giá trị hiển thị của lable
		tfSoC.setText("");
		// set vị trí
		tfSoC.setBounds(140, 200, 200, 40);
		// set màu
		tfSoC.setForeground(Color.DARK_GRAY);
		// set phông chữ
		tfSoC.setFont(new Font("Arial", Font.BOLD, 25));

		// khởi tạo đối ượng btTinh
		btTinh = new JButton();
		// set giá trị hiển thị của lable
		btTinh.setText("Tính");
		// set vị trí
		btTinh.setBounds(40, 250, 100, 40);
		// set màu
		btTinh.setForeground(Color.BLACK);
		// set phông chữ
		btTinh.setFont(new Font("Arial", Font.PLAIN, 20));

		// khởi tạo đối ượng btBack
		btBack = new JButton();
		// set giá trị hiển thị của lable
		btBack.setText("Back");
		// set vị trí
		btBack.setBounds(200, 250, 100, 40);
		// set màu
		btBack.setForeground(Color.BLACK);
		// set phông chữ
		btBack.setFont(new Font("Arial", Font.PLAIN, 20));

		// Khởi tạo đối tượng taKetQua
		taKetQua = new JTextArea();
		taKetQua.setText("");
		// set vị trí
		taKetQua.setBounds(20, 330, 350, 100);
		// set màu
		taKetQua.setForeground(Color.BLACK);
		// set phông chữ
		taKetQua.setFont(new Font("Arial", Font.PLAIN, 20));

		// add component vào panel
		add(lbTitle);
		add(lbSoA);
		add(lbSoB);
		add(lbSoC);
		add(lbKetQua);
		add(tfSoA);
		add(tfSoB);
		add(tfSoC);
		add(taKetQua);
		add(btTinh);
		add(btBack);

	}

	@Override
	public void addEvent() {
		//xử lý buton tinh
		ActionListener tinh =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String giaTriA = tfSoA.getText();
				String giaTriB = tfSoB.getText();
				String giaTriC = tfSoC.getText();
				double soA =Common.convertStringToDouble(giaTriA, 0);
				double soB =Common.convertStringToDouble(giaTriB, 0);
				double soC =Common.convertStringToDouble(giaTriC, 0);
				
				//tính toán
				PhuongTrinhBacHai ptbh =new PhuongTrinhBacHai(soA, soB, soC);
				ptbh.tinhNghiem();
				
				String kq =ptbh.inKQ();
				taKetQua.setText(kq);
				
			}
		};
		btTinh.addActionListener(tinh);
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
