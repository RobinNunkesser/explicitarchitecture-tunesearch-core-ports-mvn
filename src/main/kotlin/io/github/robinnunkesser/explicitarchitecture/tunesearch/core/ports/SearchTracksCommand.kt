package io.github.robinnunkesser.explicitarchitecture.tunesearch.core.ports

import io.github.robinnunkesser.explicitarchitecture.Command

interface SearchTracksCommand : Command<SearchTracksDTO, List<CollectionEntity>> {
}