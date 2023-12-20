package Interface_studies;

public class Triatleta implements Nadador ,Corredor ,Ciclista {
	
	public Triatleta(){	
	}
	@Override
	public String pedalar() {
		return "Esta pedalando"
	}
	@Override
	public String nadar() {
		return "Esta nadando"
	}
	@Override
	public String correr() {
		return "Esta correndo"
	}

}
