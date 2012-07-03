package org.geotools.process.geometry.gs;

import org.geoserver.wps.gs.GeoServerProcess;
import org.geoserver.wps.jts.DescribeParameter;
import org.geoserver.wps.jts.DescribeProcess;
import org.geoserver.wps.jts.DescribeResult;
import org.geotools.geometry.jts.PolygonTools;

import com.vividsolutions.jts.geom.Geometry;

/**
 * Splits a Polygon (which may contain holes) by a LineString.
 * 
 * @author Martin Davis
 * 
 */
@DescribeProcess(title = "splitPolygon", description = "Splits a Polygon (which may contain holes) by a LineString")
public class SplitPolygonProcess implements GeoServerProcess {

    @DescribeResult(name = "result", description = "The collection of result polygons")
    public Geometry execute(
            @DescribeParameter(name = "polygon", description = "The polygon to be split") Geometry poly,
            @DescribeParameter(name = "line", description = "The line to split by") Geometry line)
            throws Exception {
    	return PolygonTools.splitPolygon(poly, line);
    }

}
