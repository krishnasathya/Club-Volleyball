package com.example.recycleview;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClubData {
    private static String [] clubName = {
            "Al Rayyan",
            "Belogorie Belgorod",
            "CSKA Moscow[A]",
            "Gonzaga Milano",
            "Jastrzębski Węgiel",
            "Lokomotiv Novosibirsk",
            "Lube Civitanova",
            "Parma",
            "Porto Ravenna",
            "Sada Cruzeiro",
            "Skra Bełchatów",
            "Trentino",
            "Treviso",
            "UPCN San Juan",
            "Zenit Kazan"
    };
    private static String [] clubDetail = {
            "Al Rayyan Volleyball is a professional Volleyball team based in Al-Rayyan, Qatar. It competes in the Qatari Volleyball League. They participated in the 2012 edition of the FIVB Volleyball Men's Club World Championship held in Qatar after winning the Heir Apparent Cup.",
            "VC Belogorie Belgorod (Russian: ВК Белогорье) is a Russian professional volleyball club based in Belgorod, which is participating in the Russian Volleyball Super League. VC Belogorie won the Russian Championship and the Russian Cup eight times each. The club is also a three-times CEV Champions League champion. Belogorie is the second most successful Russian club behind Zenit Kazan.",
            "VC CSKA Moscow was a Russian volleyball club. They played in the Russian Super League, winning the competition three times. The club is the most titled volleyball team in the Soviet Union / Russia and in Europe with 13 CEV Champions Leagues. In 2009, VC CSKA Moscow was disbanded due to financial problems.",
            "Volley Gonzaga Milano or simply Gonzaga Milano was a male volleyball club from Milan, Italy.",
            "KS Jastrzębski Węgiel SA – is a Polish professional men's volleyball team based in Jastrzębie-Zdrój in southern Poland, founded in 1961, and since the beginning of its foundation closely linked to coal mining in the region. One time Polish Champion, and Polish Cup winner.",
            "Lokomotiv Novosibirsk is a Russian professional volleyball club, based in Novosibirsk, playing in Russian Volleyball Super League.",
            "Associazione Sportiva Volley Lube is a professional volleyball team based in Treia, Italy. Since 1995 the club has been playing in the Serie A of the Italian Volleyball League. It won the Italian Championship five times, the Italian Cup five times, and the Italian SuperCup three-times.",
            "The Pallavolo Parma was one of the oldest and most successful professional man's volleyball clubs in Italy. Its colours were white and azure.",
            "Porto Ravenna Volley was a historical volleyball club from the city of Ravenna in Emilia-Romagna. Ravenna founded by a group of businessmen and lovers inspired by Giuseppe Brusi, it landed in A1 at the end of the eighties, continuing a tradition that makes the city one of the \"cradles\" of Italian volleyball.",
            "Sada Cruzeiro Vôlei is a Brazilian professional volleyball team based in Contagem, Minas Gerais, Brazil. They compete in the Brazilian Superliga and were the champions in the 2011–12,[1] 2013–14 and 2014–15 seasons.[2] In 2012, 2014 and 2016 won the South American Championship.[3]",
            "Skra Bełchatów, competing as PGE Skra Bełchatów for sponsorship reasons and officially called KPS Skra Bełchatów SA, is a Polish professional men's volleyball team based in Bełchatów, founded in 1957. Nine–time Polish Champion, and seven–time Polish Cup winner. The most titled Polish volleyball club of the XXI century.",
            "Diatec Trentino is a professional Italian volleyball team based in Trento, in northern Italy. It plays in the Italian Volleyball League without interruption since 2000. It has won four times the Italian Volleyball League, the Italian Cup, the Italian Super Cup, three consecutive times the CEV Champions League and a record four consecutive times the FIVB Men's Club World Volleyball Championship. In the 2010–11 season it won national, continental and world championship. It was the first team in volleyball history to have done that.",
            "Volley Treviso is a professional volleyball team based in Treviso (between 1987 and 2011) and then in 2011-12 in Belluno, Italy, and again in Treviso from 2012 to today. The team playing on Serie B.",
            "UPCN Voley or UPCN San Juan is an Argentine volleyball club based in San Juan. The club was founded in 2007 and takes part of Liga Argentina de Voleibol – Serie A1, the top level of the Argentine men's volleyball league system, since 2009–10 season. It has won 5 consecutive national championships between 2011 and 2015, becoming one of the most successful clubs on the league's history.",
            "VC Zenit-Kazan, until 2008 known as Dinamo Tattransgaz Kazan (Russian: Динамо-Таттрансгаз), is a professional men's volleyball team based in Kazan, Russia. It plays in the Super League (10-time champion). The team won the 2007–08, 2011–12, 2014–15, 2015-16, 2016-17, and 2017-18 CEV Champions League titles, thus being the most-titled club in its new history."
    };

    private static int[] clubImage = {
            R.drawable.alrayyan,
            R.drawable.belogorie,
            R.drawable.cska,
            R.drawable.gonzaga,
            R.drawable.wegiel,
            R.drawable.lokomotiv,
            R.drawable.lube,
            R.drawable.parma,
            R.drawable.porto,
            R.drawable.sada,
            R.drawable.skra,
            R.drawable.trentino,
            R.drawable.treviso,
            R.drawable.upcn,
            R.drawable.zenit
    };

    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubImage.length; position++) {
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setPhoto(clubImage[position]);
            list.add(club);
        }
        return list;
    }
}
