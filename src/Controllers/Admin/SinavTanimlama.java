package Controllers.Admin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Models.tblsinav;

@SuppressWarnings("deprecation")
@ManagedBean(name="beanSinacTanimlama")
@SessionScoped
public class SinavTanimlama {

	private List<tblsinav> listeSinav = new ArrayList<tblsinav>();

	private tblsinav sinav;
	private tblsinav tmp;
	
	private String sinavadi;
	private int sorusayisi;
		
	
	
	public tblsinav getTmp() {
		return tmp;
	}

	public void setTmp(tblsinav tmp) {
		this.tmp = tmp;
	}

	public String getSinavadi() {
		return sinavadi;
	}

	public void setSinavadi(String sinavadi) {
		this.sinavadi = sinavadi;
	}

	public int getSorusayisi() {
		return sorusayisi;
	}

	public void setSorusayisi(int sorusayisi) {
		this.sorusayisi = sorusayisi;
	}

	public SinavTanimlama() {
		this.sinavadi="Bizim Sýnav";
		this.sorusayisi=120;
		sinav = new tblsinav();		
	}
	
	public void ekle() {
		tmp = new tblsinav();
		tmp.setId(1);
		tmp.setSinavadi(this.sinavadi);
		tmp.setSorusayisi(this.sorusayisi);	
		
		listeSinav.add(tmp);		
	}
	
	
	public tblsinav getSinav() {
		return sinav;
	}


	public void setSinav(tblsinav sinav) {
		this.sinav = sinav;
	}


	public List<tblsinav> getListeSinav() {
		return listeSinav;
	}

	public void setListeSinav(List<tblsinav> listeSinav) {
		this.listeSinav = listeSinav;
	}
	
	
	
}
