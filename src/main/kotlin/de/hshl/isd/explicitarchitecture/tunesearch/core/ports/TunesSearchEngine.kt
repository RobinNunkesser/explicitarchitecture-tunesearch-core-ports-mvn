package de.hshl.isd.explicitarchitecture.tunesearch.core.ports

interface TunesSearchEngine {
    suspend fun getSongs(term: String): Result<List<TrackEntity>>
}