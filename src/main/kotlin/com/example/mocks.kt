package com.example

import com.example.services.Lottery
import com.example.services.Result

object Mocks {

    val lottery = Lottery(name = "Pix 01", hour = "08:00")

    val result = Result(
        id = 1,
        one = "0001",
        two = "0002",
        three = "0003",
        four = "0005",
        five = "0006",
        date = "2024-01-01",
        lottery = lottery
    )
}