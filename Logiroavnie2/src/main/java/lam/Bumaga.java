package lam;

public class Bumaga {
	private int nomer;
	private String name;

	public Bumaga(int nomer, String name) {
		this.nomer = nomer;
		this.name = name;
	}

	public int getNomer() {
		return nomer;
	}

	public void setNomer(int nomer) {
		this.nomer = nomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bumaga [nomer=" + nomer + ", name=" + name + "]";
	}

}