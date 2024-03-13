
package mc;

class Personne {
private String name;
private String prenom;
private int num;

public Personne(String name, String prenom, int num) {
	super();
	this.name = name;
	this.prenom = prenom;
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}

}


class Client extends Personne {
	 private int id;
	 

	public Client(String name, String prenom, int num,int id) {
		super(name, prenom, num);
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ",Name()=" + getName() + ", Prenom()=" + getPrenom()
				+ ", getNum()=" + getNum();
	}
	void presentation() {
		System.out.println(toString());
	}

	

	
	 
}
