package org.geotools.process.geometry.gs;

import java.util.Collection;
import java.util.List;

import org.geoserver.wps.gs.GeoServerProcess;
import org.geoserver.wps.jts.DescribeParameter;
import org.geoserver.wps.jts.DescribeProcess;
import org.geoserver.wps.jts.DescribeResult;
import org.geotools.geometry.jts.PolygonTools;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.util.LineStringExtracter;
import com.vividsolutions.jts.operation.polygonize.Polygonizer;

/**
 * Polygonizes a set of linework, supplied as a LineString or MultiLineString.
 * 
 * @author Martin Davis
 * 
 */
@DescribeProcess(title = "polygonize", description = "Polygonizes a set of linework, supplied as a LineString or MultiLineString")
public class PolygonizeProcess implements GeoServerProcess {

    @DescribeResult(name = "result", description = "The result polygons")
    public Geometry execute(
            @DescribeParameter(name = "geometry", description = "The linework to be polygonized") Geometry geometry)
            throws Exception {
    	return PolygonTools.polygonize(geometry);
    }

}
