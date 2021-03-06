package org.LMNSolutions.WPS;

import org.geotools.coverage.grid.GridCoverage2D;
import org.geoserver.wps.gs.GeoServerProcess;
import org.geoserver.wps.jts.DescribeParameter;
import org.geoserver.wps.jts.DescribeProcess;
import org.geoserver.wps.jts.DescribeResult;
import org.joda.time.Duration;

import com.vividsolutions.jts.geom.Geometry;


@DescribeProcess(title = "HelicopterReachability", description = "Given a raster, find the area a helicopter can fly in.")
public class HelicopterReachability implements GeoServerProcess {

    @DescribeResult(name = "result", description = "The collection of result polygons.")
    public Geometry execute(
            @DescribeParameter(name = "raster", description = "The raster to check against.") GridCoverage2D _coverage,
    		@DescribeParameter(name = "startPoint", description = "The point to start at.") Geometry _startPoint)
            throws Exception {
    	return calculateArea(_coverage, _startPoint);
    }
    
    public static Geometry calculateArea(GridCoverage2D _coverage, Geometry _start) 
	{
    	return null;
	}
    
    private static Geometry calculateImpassableAreas(Duration time, double elevation_m)
    {
    	return null;
    }
}