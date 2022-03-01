package com.jhonssantiago.mybooklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView_itens;
    private MyAdapter meuAdapter;
    private ArrayList<Book> books;
  //  public Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView_itens = findViewById(R.id.listView_itens);
        criarLista();
        meuAdapter = new MyAdapter(getApplicationContext(), books);
        listView_itens.setAdapter(meuAdapter);
        listView_itens.setOnItemClickListener(this);
    }

    private void criarLista(){
        books = new ArrayList<>();
        Book b1 = new Book(R.drawable.ascensao_dos_dragoes, "A ascensão dos dragões", "Ficção científica", "Kyra, 15 anos, sonha em se tornar uma guerreira famosa, como seu pai, embora ela seja a única garota em uma fortaleza de meninos. Enquanto luta para entender suas habilidades especiais, - sua misteriosa força interior, ela percebe que é diferente dos demais. Mas um segredo quanto ao seu nascimento e sobre uma profecia está sendo guardado, deixando Kyra se perguntando quem ela realmente é. Quando Kyra atinge a idade prevista e um senhor local se aproxima para levá-la embora, seu pai planeja realizar um casamento para salvá-la. Mas Kyra se recusa, e começa sua própria jornada, por uma floresta perigosa, onde ela encontra um dragão ferido - e inicia uma série de eventos que mudarão o reino para sempre", "23,00");
        Book b2 = new Book(R.drawable.ascensao_dos_bravos, "A ascensão dos bravos", "Ficção científica", "A ASCENÇÃO DOS BRAVOS é o segundo livro da série de fantasia épica de Morgan Rice, REIS E FEITICEIROS (que começa com A ASCENÇÃO DOS DRAGÕES)! No despertar do ataque do dragão, Kyra é enviada numa missão urgente: atravessar Escalon e procurar pelo seu tio na misteriosa Torre de Ur. Chegou o momento de ela saber quem é, quem é a sua mãe e de treinar e desenvolver os seus poderes especiais. Será uma missão repleta de perigos para uma miúda sozinha, com Escalon cheia de perigos vindos de feras selvagens e de homens idênticos - uma que vai exigir toda a sua força para sobreviver", "23,00");
        Book b3 = new Book(R.drawable.a_origem, "A Origem", "Ficção científica", "O ano era 2024, Dan e Dante levavam uma vida comum e normal como qualquer outro jovem até que um dia, uma empresa de Biomedicina lança um soro capaz de mudar o DNA da humanidade e revolucionar o modo de vida a qual estávamos acostumados. Mas as coisas não saem tão bem quanto eles imaginavam com um grande avanço na saúde vem um grande avanço na doença junto, um parasita surge modificando e fazendo com que parte da humanidade fosse dizimada, Andarilhos começam a caminhar sobre a terra, criaturas que antes só apareciam em filmes e historias de terror começam a surgir, um mundo que antes era habitável agora se encontra em ruínas. Os irmãos Hawks partem em uma jornada por descoberta e respostas, mas a jornada que está para começar não será fácil, nem tudo o que eles verão e o que irá se colocar contra eles em seus caminhos será fácil, o poder ao qual eles carregam dentro de si será o suficiente ?", "23,00");
        Book b4 = new Book(R.drawable.perdido_em_marte, "Perdido em Marte", "Ficção científica", "Há seis dias, o astronauta Mark Watney se tornou a décima sétima pessoa a pisar em Marte. E, provavelmente, será a primeira a morrer no planeta vermelho. Depois de uma forte tempestade de areia, a missão Ares 3 é abortada e a tripulação vai embora, certa de que Mark morreu em um terrível acidente. Ao despertar, ele se vê completamente sozinho, ferido e sem ter como avisar às pessoas na Terra que está vivo. E, mesmo que conseguisse se comunicar, seus mantimentos terminariam anos antes da chegada de um possível resgate. Ainda assim, Mark não está disposto a desistir. Munido de nada além de curiosidade e de suas habilidades de engenheiro e botânico – e um senso de humor inabalável –, ele embarca numa luta obstinada pela sobrevivência. Para isso, será o primeiro homem a plantar batatas em Marte e, usando uma genial mistura de cálculos e fita adesiva, vai elaborar um plano para entrar em contato com a Nasa e, quem sabe, sair vivo de lá.", "R$ 149,90");
        Book b5 = new Book(R.drawable.transmissao, "Transmissão (As Crónicas da Invasão – Livro Um)", "Ficção científica", "Um rapaz de 13 anos, a morrer de uma doença cerebral rara, é a única pessoa capaz de ouvir e descodificar sinais do espaço intergaláctico. Seti confirma que é um sinal real. Qual é a mensagem? Como irá o mundo reagir? E acima de tudo: os alienígenas vêm ai?", "23,00");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Book b = (Book) meuAdapter.getItem(position);

        Intent it = new Intent(getApplicationContext(), ActivityDetailsBook.class);
        it.putExtra("capa", b.getCapa());
        it.putExtra("titulo", b.getTitulo());
        it.putExtra("preco", b.getPreco());
        it.putExtra("categoria", b.getCategoria());
        it.putExtra("sinopse", b.getSinopse());
        startActivity(it);
      //  Toast.makeText(getApplicationContext(), b.toString(), Toast.LENGTH_SHORT).show();
    }

}