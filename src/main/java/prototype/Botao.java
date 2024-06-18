package prototype;

// Descrição do problema: Toda vez que o usuário desejar um novo botão será preciso criar uma nova classe que herde
// dessa classe mãe e defina seus próprios atributos de acordo com o desejado, exemplo disso são as classes
// "Botão Vermelho", "Botão Azul" e "Botão Amarelo".

public class Botao {

    protected String cor;
    protected int largura;
    protected int altura;
    protected TipoBordaEnum tipoBorda;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public TipoBordaEnum getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(TipoBordaEnum tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

    @Override
    public String toString() {
        return "Botao{" +
                "cor='" + cor + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", tipoBorda=" + tipoBorda +
                '}';
    }
}
