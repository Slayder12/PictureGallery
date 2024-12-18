package com.example.picturegallery

import java.io.Serializable

class Picture(
    val name: String,
    val creator: String,
    val imageView: Int
) : Serializable {

    companion object{
        val viewPagerList = mutableListOf(
            Picture(
              "Любовники моей жены",
                "Карл Калер\n1893 год",
                (R.drawable.my_wifes_lovers)
            ),
            Picture(
                "Надоела",
                "Александр Маковский\n1897 год",
                (R.drawable.im_sick_of_it)
            ),
            Picture(
                "Влюбленные",
                "Рене Магритт\n1928 год",
                (R.drawable.lovers)
            ),
            Picture(
                "Апофеоз войны",
                "Василий Верещагин\n1871 год",
                (R.drawable.apotheosis_of_war)
            ),
            Picture(
                "Все в прошлом",
                "Василий Максимов\n1889 год",
                (R.drawable.its_in_the_past)
            ),
            Picture(
                "Монахи (Не туда заехали)",
                "Лев Соловьев\n1897 год",
                (R.drawable.monks_wrong_way_round)
            ),
            Picture(
                "Опять двойка",
                "Федор Решетников\n1952 год",
                (R.drawable.another_d)
            ),
            Picture(
                "Бегство от критики",
                "Федор Решетников\n1874 год",
                (R.drawable.escaping_criticism)
            ),
            Picture(
                "Наказание сплетницы",
                "Игнасио Диас де Олано\n1910 год",
                (R.drawable.punishing_the_gossip_girl)
            ),
            Picture(
                "Достойный член гуманного общества",
                "Эдвин Генри Ландсир\n1831 год",
                (R.drawable.a_worthy_member_of_the_humane_society)
            ),

        )

    }
}