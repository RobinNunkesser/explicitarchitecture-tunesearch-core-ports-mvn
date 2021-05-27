package io.github.robinnunkesser.explicitarchitecture.tunesearch.core.ports

interface TunesSearchEngine {
    suspend fun getSongs(term: String): List<TrackEntity>
}