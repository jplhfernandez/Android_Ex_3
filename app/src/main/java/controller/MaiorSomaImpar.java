package controller;

public class MaiorSomaImpar {

    public int Maior(int PrimeiroNum, int SegundoNum) {
        if (PrimeiroNum > SegundoNum){
            return PrimeiroNum;
        }
        else {
            return SegundoNum;
        }
    }

    public int SomaImpar(int PrimeiroNum, int SegundoNum) {
        int soma = 0;
        for (int i = PrimeiroNum; i <= SegundoNum; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }
        return soma;
    }
}
