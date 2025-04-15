package com.example.themoviedb.database

import com.example.themoviedb.model.Movie

class Movies {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie(1,
                "A Minecraft Movie",
                "/yFHHfHcUgGAxziP1C3lLt0q2T4s.jpg",
                "/is9bmV6uYXu7LjZGJczxrjJDlv8.jpg",
                "2025-03-31",
                "By day, they're invisible—valets, hostesses, and bartenders at a luxury hotel. By night, they're the Carjackers, a crew of skilled drivers who track and rob wealthy clients on the road. As they plan their ultimate heist, the hotel director hires a ruthless hitman, to stop them at all costs. With danger closing in, can Nora, Zoe, Steve, and Prestance pull off their biggest score yet?"
            ),
            Movie(
                2,
                "G20",
                "/tSee9gbGLfqwvjoWoCQgRZ4Sfky.jpg",
                "/sNx1A3822kEbqeUxvo5A08o4N7o.jpg",
                "2025-04-09",
                "After the G20 Summit is overtaken by terrorists, President Danielle Sutton must bring all her statecraft and military experience to defend her family and her fellow leaders.",
            ),
            Movie(
                3,
                "Mickey 17",
                "/edKpE9B5qN3e559OuMCLZdW1iBZ.jpg",
                "/6J259Zuq09Bt2PLUNeTS5a3DwLZ.jpg",
                "2025-02-28",
                "Unlikely hero Mickey Barnes finds himself in the extraordinary circumstance of working for an employer who demands the ultimate commitment to the job… to die, for a living.",
            ),
            Movie(
                4,
                "Moana 2",
                "/aLVkiINlIeCkcZIzb7XHzPYgO6L.jpg",
                "/o5vasl0xbZWWKQnAlaBTSgntHH2.jpg",
                "2024-11-21",
                "After receiving an unexpected call from her wayfinding ancestors, Moana journeys alongside Maui and a new crew to the far seas of Oceania and into dangerous, long-lost waters for an adventure unlike anything she's ever faced.",
            ),
            Movie(
                5,
                "Gunslingers",
                "/O7REXWPANWXvX2jhQydHjAq2DV.jpg",
                "/lqHt4icP1GTaNBeVTxTrwTZdoAW.jpg",
                "2025-04-11",
                "When the most wanted man in America surfaces in a small Kentucky town, his violent history -- and a blood-thirsty mob seeking vengeance and a king’s ransom -- soon follow. As brothers face off against one another and bullets tear the town to shreds, this lightning-fast gunslinger makes his enemies pay the ultimate price for their greed.",
            )
        )
    }
}