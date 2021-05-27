package io.github.robinnunkesser.explicitarchitecture.tunesearch.core.ports

import de.hshl.isd.explicitarchitecture.Command

interface SearchTracksCommand : Command<SearchTracksDTO, List<CollectionEntity>> {
}