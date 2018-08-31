
package sistema;

public class Documento {
   
    private int numSequencial;
    private String nomeRemetente;
    private String tituloDoc;

    public Documento(int numSequencial, String nomeRemetente, String tituloDoc) {
        this.numSequencial = numSequencial;
        this.nomeRemetente = nomeRemetente;
        this.tituloDoc = tituloDoc;
    }

    Documento() {
    }

    public int getNumSequencial() {
        return numSequencial;
    }

    public void setNumSequencial(int numSequencial) {
        this.numSequencial = numSequencial;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public String getTituloDoc() {
        return tituloDoc;
    }

    public void setTituloDoc(String tituloDoc) {
        this.tituloDoc = tituloDoc;
    }

    @Override
    public String toString() {
        return "Numero Sequencial: " + numSequencial +  "\n" + "Nome Rementente: " + nomeRemetente +
                "\n" + "Titulo do Documento: " + tituloDoc;
    }
    
}
