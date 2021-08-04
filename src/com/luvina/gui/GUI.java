package com.luvina.gui;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.luvina.IAnHien.IAnHien;
import com.luvina.gui.icommon.ICommon;
import com.luvina.gui.panel.CacPhepTinh;
import com.luvina.gui.panel.MainPanel;
import com.luvina.gui.panel.PTBacHai;
import com.luvina.gui.panel.PTBacNhat;

public class GUI extends JFrame implements ICommon,IAnHien{
	private MainPanel mainpanel;
	private PTBacNhat ptbn;
	private PTBacHai ptbh;
	private CacPhepTinh cacPhepTinh;
	
	
	public GUI() {
		init();
		addComponent();
		addEvent();
	}

	@Override
	public void init() {
		setTitle("Menu");
		setSize(400, 500);
		setLocationRelativeTo(null);
		setLayout(new CardLayout());
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void addComponent() {
		mainpanel = new MainPanel();
		ptbn =new PTBacNhat();
		ptbh =new PTBacHai();
		cacPhepTinh =new CacPhepTinh();
		
		//add event để sử dụng các phương thức ẩn hiện 
		mainpanel.addEventMainPanel(this);
		ptbn.addEventPTBN(this);
		ptbh.addEventPTBH(this);
		cacPhepTinh.addEventCacPhepTinh(this);
		
		//thêm component
		add(mainpanel);
		add(ptbn);
		add(ptbh);
		add(cacPhepTinh);
		
		
	}
  
	//xử lý thoát chương trình
	@Override
	public void addEvent() {
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn chưa?");
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		};
		addWindowListener(wa);
		
	}

	//hiển thị mainPanel, các panel khác ẩn hết
	@Override
	public void anMainPanel() {
		mainpanel.setVisible(true);
		ptbn.setVisible(false);
		ptbh.setVisible(false);
		cacPhepTinh.setVisible(false);
		
	}

	//hiển thị ptbn
	@Override
	public void anPTBacNhat() {
		mainpanel.setVisible(false);
		ptbn.setVisible(true);
		ptbh.setVisible(false);
		cacPhepTinh.setVisible(false);
		
	}

	//hiển thi ptbh
	@Override
	public void anPTBacHai() {
		mainpanel.setVisible(false);
		ptbn.setVisible(false);
		ptbh.setVisible(true);
		cacPhepTinh.setVisible(false);
		
	}

	//hiện thị các phép tính
	@Override
	public void anCacPhepTinh() {
		mainpanel.setVisible(false);
		ptbn.setVisible(false);
		ptbh.setVisible(false);
		cacPhepTinh.setVisible(true);
		
	}

}
