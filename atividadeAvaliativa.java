void main(){
    String nome = IO.readln("Digite seu nome: ");
    String pesoStr = IO.readln("Digite seu Peso: ");
    double peso = Double.parseDouble(pesoStr);
    String alturaStr = IO.readln("Digite sua Altura: ");
    double altura = Double.parseDouble(alturaStr);
    char genero = IO.readln("Digite o Genero: M -> Masculino, F -> Feminino, N -> Nao identifico com nenhum:   ").charAt(0);

    double imc = peso / (altura * altura);

    String resposta = "";

    switch (genero) {
        case 'm', 'M':
            if (imc >= 40){
                resposta = "Obesidade Morbida";
            } else if (imc > 30 && imc < 39.9){
                resposta = "Obesidade Moderada";
            } else if (imc > 25 && imc < 29.9){
                resposta = "Obesidade Leve";
            } else if (imc > 20 && imc < 24.9) {
                resposta = "Normal";
            } else {
                resposta = "Abaixo do Normal";
            }
            break;
        case 'f', 'F', 'n', 'N':
            if (imc >= 39){
                resposta = "Obesidade Morbida";
            } else if (imc > 29 && imc < 38.9){
                resposta = "Obesidade Moderada";
            } else if (imc > 24 && imc < 28.9){
                resposta = "Obesidade Leve";
            } else if (imc > 19 && imc < 23.9) {
                resposta = "Normal";
            } else {
                resposta = "Abaixo do Normal";
            }
            break;
        default:
            break;
    }

    if (resposta != ""){
        IO.println("Nome: " + nome);
        IO.println("Genero: " + genero);
        IO.println("IMC: " + imc);
        IO.println("Classificacao: " + resposta);
    } 

}