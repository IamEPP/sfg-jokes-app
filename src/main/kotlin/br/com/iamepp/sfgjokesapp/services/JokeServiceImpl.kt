package br.com.iamepp.sfgjokesapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl(
        private val chuckNorrisQuotes: ChuckNorrisQuotes = ChuckNorrisQuotes()) : JokeService {

    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}