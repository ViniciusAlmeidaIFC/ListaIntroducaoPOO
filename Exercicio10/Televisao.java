package Exercicio10;

public class Televisao {

	private int canalAtual = 0;
	private int volumeAtual = 0;

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		if (canalAtual >= 1 && canalAtual <= 100)
			this.canalAtual = canalAtual;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		if (volumeAtual >= 0 && volumeAtual <= 100)
			this.volumeAtual = volumeAtual;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Televisao [canalAtual=");
		builder.append(canalAtual);
		builder.append(", volumeAtual=");
		builder.append(volumeAtual);
		builder.append("]");
		return builder.toString();
	}

}
