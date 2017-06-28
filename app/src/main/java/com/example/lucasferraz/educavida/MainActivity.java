package com.example.lucasferraz.educavida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.random);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] random = {"1. ABERTISMO\n" +
                        "\n" +
                        "Esteja aberto(a) a experimentar novas ideias e técnicas, quebrar paradigmas, abolir crenças e mitos pessoais que atrapalhem as mudanças necessárias para o desenvolvimento pessoal. Experimente novos lugares, novos sabores, novos conceitos, novas ciências, novas pessoas. Amplie sua mundividência.\n" +
                        "\n" +
                        "Qual o seu nível de abertismo e gosto pelo novo? Gosta de viajar? Experimenta novidades regularmente?", "2. Afetividade\n" +
                        "\n" +
                        "A vivência da afetividade compõe o ser humano. Um carinho, um olhar, um aconchego podem ser bálsamo de conforto e reparação, gerar júbilo e plenitude. Entre familiares, amigos, entre um casal. Um gesto muitas vezes vale mais que mil palavras.\n" +
                        "\n" +
                        "Você costuma tratar com carinho suas relações mais próximas? Sabe receber afeto? Qual o seu nível de carência?", "3. Alimentação Saudável\n" +
                        "\n" +
                        "A qualidade de vida depende também de uma alimentação saudável. Hoje são oferecidos no mercado verdadeiros venenos para a saúde, considerados, às vezes, “manjares dos deuses”. São as frutas carregadas de agrotóxicos, as bombas de calorias de açúcar e gordura, as frituras, os conservantes, estabilizantes, corantes, aromatizantes, inúmeros químicos destruidores do corpo humano. Outro problema são os excessos alimentares, como também a ingestão de bebidas alcoólicas.\n" +
                        "\n" +
                        "Você tem um padrão de alimentação adequado em qualidade e quantidade? Que tipo de lanchinho costuma fazer? Pesquisa e investe em aprender a desenvolver uma alimentação saudável?", "4. Anticomoções\n" +
                        "\n" +
                        "Evitar acumpliciamento com os emocionalismos infantis incentivados pela sociedade, que obnubilam nossa razão e nos levam a atitudes imaturas e prejudiciais. Diminuir o excesso de autoexposição e romper com os exageros da valorização das emoções por parte da atual sociedade, refletida nos apelos emocionais de músicas, poesias e dramas literários, cinematográficos, teatrais. Não se trata aqui de desprover-se de sensibilidade e sentimentos nobres, mas sim de evitar e não valorizar os comocionalismos.\n" +
                        "\n" +
                        "Qual seu nível de discernimento e autocontrole pessoais? Você ainda\n" +
                        "\n" +
                        "chora com propagandas apelativas exageradas?", "5. ANTICONFLITO\n" +
                        "\n" +
                        "Conheça os limites da anticonflitividade íntima e com os outros, de maneira racional, a partir dos investimentos pessoais do autodesenvolvimento e no saber lidar com as situações de conflito, muitas vezes construtivas de novas aprendizagens. Muito importante aqui é viver o “locus interno”, não responsabilizando o outro sobre seus sentimentos íntimos. Buscar entender o PORQUÊ e não QUEM e a manutenção do respeito e autorrespeito diante dos conflitos.\n" +
                        "\n" +
                        "Você mantém o equilíbrio e a lucidez diante dos conflitos? Qual a sua habilidade em resolver e aprender com os conflitos?", "6. Anti-MDE\n" +
                        "\n" +
                        "Quando não conseguimos lidar com certas situações, surgem mecanismos de defesa para evitarmos autoconstrangimentos. Alguns MDEs: Projeção: quando temos um defeito, não o reconhecemos, mas o criticamos em outra pessoa; Transferência: alguém nos faz mal e, ao invés de discernir e conversar com a pessoa, passamos a criticar ou punir outra pessoa; Racionalização: saímos atrasados para uma reunião, pegamos um engarrafamento e justificamos o atraso somente pelo trânsito enfrentado. Atenção aos Mecanismos de Defesa do Ego que quebram nosso discernimento e coerência!\n" +
                        "\n" +
                        "Você já identificou algum MDE em seus comportamentos? Mantém alguma postura nociva, em função de um ganho secundário (ex.: o fumante que mantém o vício para emagrecer ou manter autoconfiança deslocada)?"};
                Random sorteio = new Random();
                String fraseSorteada = random[sorteio.nextInt(6)];
                Log.d("Sorteio", ";" + fraseSorteada);
                TextView textView = (TextView) findViewById(R.id.frases_random);
                textView.setText(fraseSorteada);
            }
        });
    }
}
