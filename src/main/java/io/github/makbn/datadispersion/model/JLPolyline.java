package io.github.makbn.datadispersion.model;

import lombok.*;

/**
 * A class for drawing polyline overlays on the map.
 * by: Mehdi Akbarian Rastaghi (@makbn)
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class JLPolyline {
    /** id of JLPolyline! this is an internal id for JLMap Application and not related to Leaflet! */
    private int id;
    /** theming options for JLPolyline. all options are not available! */
    private JLOptions options;
    /** The array of {{@link io.github.makbn.datadispersion.model.JLLatLng}} points of JLPolyline*/
    private JLLatLng[] vertices;
}
