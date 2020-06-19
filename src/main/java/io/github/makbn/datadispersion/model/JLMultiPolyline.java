package io.github.makbn.datadispersion.model;

import lombok.*;

/**
 * A class for drawing polyline overlays on a map
 * by: Mehdi Akbarian Rastaghi (@makbn)
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class JLMultiPolyline {
    /** id of JLMultiPolyline! this is an internal id for JLMap Application and not related to Leaflet! */
    private int id;
    /** theming options for JLMultiPolyline. all options are not available! */
    private JLOptions options;
    /** The array of {{@link io.github.makbn.datadispersion.model.JLLatLng}} points of JLMultiPolyline*/
    private JLLatLng[][] vertices;
}
