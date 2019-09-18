package com.takatutustudio.projectrecyclerview.data;

import com.takatutustudio.projectrecyclerview.model.Movie;

import java.util.ArrayList;

public class MovieData {
    //Array data yang akan muncul di RecyclerView
    public static String[][] data = new String[][] {
            {"It Chapter Two",
                    "September 6, 2019",
                    "100",
                    "5.0",
                    "\"27 years after overcoming the malevolent supernatural entity Pennywise, the former members of the Losers' Club, who have grown up and moved away from Derry, are brought back together by a devastating phone call\".",
                    "https://image.tmdb.org/t/p/w185_and_h278_bestv2/zfE0R94v1E8cuKAerbskfD3VfUt.jpg"},
            {"Spider-Man: Far from Home",
                    "July 2, 2019",
                    "100",
                    "6.0",
                    "\"Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.\"",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lcq8dVxeeOqHvvgcte707K0KVx5.jpg"},
            {"Captain Marvel",
                    "March 8, 2019",
                    "100", "7.0", "The story follows Carol Danvers as she becomes one of the universe’s most powerful heroes when Earth is caught in the middle of a galactic war between two alien races. Set in the 1990s, Captain Marvel is an all-new adventure from a previously unseen period in the history of the Marvel Cinematic Universe.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/AtsgWhDnHTq68L0lLsUrCnM7TjG.jpg"},
            {"Ant-Man and the Wasp ",
                    "June 25, 2018",
                    "100",
                    "6.0",
                    "Just when his time under house arrest is about to end, Scott Lang once again puts his freedom at risk to help Hope van Dyne and Dr. Hank Pym dive into the quantum realm and try to accomplish, against time and any chance of success, a very dangerous rescue mission.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eivQmS3wqzqnQWILHLc4FsEfcXP.jpg"},
            {"Deadpool 2",
                    " May 10, 2018",
                    "100",
                    "7.0",
                    "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg"},
            {"Black Panther",
                    "January 29, 2018",
                    "90", "8.0", "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"},
            {"Ready Player One",
                    "March 11, 2018",
                    "89",
                    "5.0",
                    "When the creator of a popular video game system dies, a virtual contest is created to compete for his fortune.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/pU1ULUq8D3iRxl1fdX2lZIzdHuI.jpg"},
            {"Tomb Raider",
                    "March 16, 2018",
                    "100",
                    "8.0",
                    "Lara Croft, the fiercely independent daughter of a missing adventurer, must push herself beyond her limits when she finds herself on the island where her father disappeared.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3zrC5tUiR35rTz9stuIxnU1nUS5.jpg"},
            {"Pacific Rim: Uprising",
                    "March 23, 2018",
                    "90",
                    "8.0",
                    "It has been ten years since The Battle of the Breach and the oceans are still, but restless. Vindicated by the victory at the Breach, the Jaeger program has evolved into the most powerful global defense force in human history. The PPDC now calls upon the best and brightest to rise up and become the next generation of heroes when the Kaiju threat returns.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/v5HlmJK9bdeHxN2QhaFP1ivjX3U.jpg"},
            {"Jurassic World: Fallen Kingdom",
                    "June 22, 2018",
                    "100",
                    "7.9",
                    "Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/c9XxwwhPHdaImA2f1WEfEsbhaFB.jpg"},
    };
    //--

    //Data yang akan dihubungkan ke Movie model
    public static ArrayList<Movie> getListData() {
        Movie movie;
        ArrayList<Movie> list = new ArrayList<>();

        for (String[] mData : data) {
            movie = new Movie();
            movie.setJudulFilm(mData[0]);
            movie.setTglRilis(mData[1]);
            movie.setKepopuleran(mData[2]);
            movie.setRangking(mData[3]);
            movie.setDescFilm(mData[4]);
            movie.setPhoto(mData[5]);

            list.add(movie);
        }

        return list;
    }
}

