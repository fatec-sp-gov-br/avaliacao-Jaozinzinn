package br.edu.poo;

public class Jogo {

    public static void main(String[] args) {

        // Implemente a batalha aqui
        // personagens
        Personagem heroi = new Personagem("Steve", 30, 10, 3);
        Personagem monstro = new Personagem("Bruxa", 20, 8, 4);

        // poção
        Pocao pocaoHeroi = new Pocao("Poção de Cura", 10);
        Pocao pocaoMonstro = new Pocao("Poção de Cura", 10);

        System.out.println("=== BATALHA INICIADA ===");

        boolean monstroUsouPocao = false;

        while (heroi.estaVivo() && monstro.estaVivo()) {
            heroi.atacar(monstro);

            if (!monstro.estaVivo()) {
                break;
            }
            monstro.atacar(heroi);

            if (!heroi.estaVivo()) {
                break;
            }

            if (heroi.getVida() < 15) {
               heroi.usarPocao(pocaoHeroi);
}
            if (!monstroUsouPocao && monstro.getVida() < 15) {
                monstro.usarPocao(pocaoMonstro);
                monstroUsouPocao = true;
            }
        }

        System.out.println("=== FIM DA BATALHA ===");

        if (heroi.estaVivo()) {
            System.out.println("Vencedor: " + heroi.getNome());
        } else {
            System.out.println("Vencedor: " + monstro.getNome());
        }
    }
}
