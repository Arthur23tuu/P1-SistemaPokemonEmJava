public class Pokemon {
    private String nome;
    private int hp;
    private int ataque;

    //método construtor
    public Pokemon (String nomeRecebido, int hpRecebido, int ataqueRecebido) {
        setNome(nomeRecebido);
        setHp(hpRecebido);
        setAtaque(ataqueRecebido);
    }

    //set e get
    //encapsulamento
    public void setHp(int novoHp) {
        this.hp = novoHp;
    }
    public void setNome (String novoNome) {
        this.nome = novoNome;
    }
    public void setAtaque(int novoAtaque) {
        this.ataque = novoAtaque;
    }

    public int getHp() {
        return this.hp;
    }
    public String getNome() {
        return this.nome;
    }
    public int getAtaque() {
        return this.ataque;
    }

    //método pra ataque
    //classe como parâmetro
    public void atacar(Pokemon alvo) {

        System.out.println(this.getNome() + " atacou" + alvo.getNome() + "!");

        int vidaQueSobrou = alvo.getHp() - this.getAtaque();

        alvo.setHp(Math.max(0, vidaQueSobrou)); //Math.max pra vida do pokemon não ficar negativa

        System.out.println(alvo.getNome() + " ficou com " + alvo.getHp() + " de HP.\n");
    }
    //sobrecarga de método
    public void atacar() {
        System.out.println(this.getNome() + " errou o ataque!\n");
    }
}
