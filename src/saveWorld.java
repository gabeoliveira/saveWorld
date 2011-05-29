
public class saveWorld {

	private int numPontos;//numero de pontos que devem ser cobertos
	private int numEstacoes;
	private Estacao[] estacoes;
	
	public int getNumPontos() {
		return numPontos;
	}

	public void setNumPontos(int numPontos) {
		this.numPontos = numPontos;
	}

	public int getNumEstacoes() {
		return numEstacoes;
	}

	public void setNumEstacoes(int numEstacoes) {
		this.numEstacoes = numEstacoes;
	}

	public Estacao[] getEstacoes() {
		return estacoes;
	}

	public void setEstacoes(Estacao[] estacoes) {
		this.estacoes = estacoes;
	}	

	public static void save(String nomeArquivo) 
	{
		Arquivo a = new Arquivo(nomeArquivo);
		saveWorld sw = a.loadDados();
		Solucao s = new Tentativa1().geraSolucao(sw);		
		s.showResult();
	}
	
	/**
	 * @param args nome do arquivo de dados
	 */
	public static void main(String[] args) 
	{
		saveWorld.save("i1.txt");
				
	}

}