/*
 * Copyright © 2013–2016 Michael von Glasow.
 * 
 * This file is part of LSRN Tools.
 *
 * LSRN Tools is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LSRN Tools is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LSRN Tools.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.vonglasow.michael.satstat;

import java.io.File;

import android.net.ConnectivityManager;
import android.os.Environment;

/**
 * Constants used throughout the application.
 */
public class Const {

	/**
	 * Milliseconds per day
	 */
	public static final long MILLIS_PER_DAY = 86400000;
	
	
	/**
	 * Earth circumference in meters
	 */
	public static final double EARTH_CIRCUMFERENCE = 40000000; // meters
	
	
	/* Intents */
	public static final String GPS_ENABLED_CHANGE = "android.location.GPS_ENABLED_CHANGE";
	public static final String GPS_FIX_CHANGE = "android.location.GPS_FIX_CHANGE";
	public static final String AGPS_DATA_EXPIRED = "com.vonglasow.michael.satstat.AGPS_DATA_EXPIRED";
	public static final String DOWNLOAD_RECEIVER_REGISTERED = "com.vonglasow.michael.satstat.DOWNLOAD_RECEIVER_REGISTERED";
	
	
	/**
	 * Available location provider styles
	 */
	public static final String [] LOCATION_PROVIDER_STYLES = {
		"location_provider_blue",
		"location_provider_green",
		"location_provider_orange",
		"location_provider_purple",
		"location_provider_red"
	};
	
	
	/**
	 * Index of the marker drawable in the location provider style
	 */
	public static final int STYLE_MARKER = 0;
	
	
	/**
	 * Index of the stroke color in the location provider style
	 */
	public static final int STYLE_STROKE = 1;
	
	
	/**
	 * Index of the fill color in the location provider style
	 */
	public static final int STYLE_FILL = 2;
	
	
	/**
	 * Blue style: default for network location provider
	 */
	public static final String LOCATION_PROVIDER_BLUE = "location_provider_blue";
	
	
	/**
	 * Red style: default for GPS location provider
	 */
	public static final String LOCATION_PROVIDER_RED = "location_provider_red";
	
	
	/**
	 * Gray style for inactive location providers
	 */
	public static final String LOCATION_PROVIDER_GRAY = "location_provider_gray";
	
	
	/* Preference keys */
	public static final String KEY_PREF_NOTIFY_FIX = "pref_notify_fix";
	public static final String KEY_PREF_NOTIFY_SEARCH = "pref_notify_search";
	public static final String KEY_PREF_UPDATE_WIFI = "pref_update_wifi";
	public static final String KEY_PREF_UPDATE_NETWORKS = "pref_update_networks";
	public static final String KEY_PREF_UPDATE_NETWORKS_WIFI = Integer.toString(ConnectivityManager.TYPE_WIFI);
	public static final String KEY_PREF_UPDATE_NETWORKS_MOBILE = Integer.toString(ConnectivityManager.TYPE_MOBILE);
	public static final String KEY_PREF_UPDATE_FREQ = "pref_update_freq";
	public static final String KEY_PREF_UPDATE_LAST = "pref_update_last";
	public static final String KEY_PREF_LOC_PROV = "pref_loc_prov";
	public static final String KEY_PREF_LOC_PROV_STYLE = "pref_loc_prov_style.";
	public static final String KEY_PREF_MAP_LAT = "pref_map_lat";
	public static final String KEY_PREF_MAP_LON = "pref_map_lon";
	public static final String KEY_PREF_MAP_ZOOM = "pref_map_zoom";
	public static final String KEY_PREF_UNIT_TYPE = "pref_unit_type";
	public static final String KEY_PREF_KNOTS = "pref_knots";
	public static final String KEY_PREF_MAP_OFFLINE = "pref_map_offline";
	public static final String KEY_PREF_MAP_PATH = "pref_map_path";
	public static final String KEY_PREF_MAP_CACHED_PATH = "pref_map_cached_path";
	public static final String KEY_PREF_MAP_DOWNLOAD = "pref_map_download";
	public static final String KEY_PREF_MAP_PURGE = "pref_map_purge";
	public static final String KEY_PREF_COORD = "pref_coord";
	public static final int KEY_PREF_COORD_DECIMAL = 0;
	public static final int KEY_PREF_COORD_MIN = 1;
	public static final int KEY_PREF_COORD_SEC = 2;
	public static final int KEY_PREF_COORD_MGRS = 3;
	public static final int KEY_PREF_COORD_UTM = 4;
	public static final String KEY_PREF_UTC = "pref_utc";
	public static final String KEY_PREF_CID = "pref_cid";
	public static final String KEY_PREF_CID2 = "pref_cid2";
	public static final String KEY_PREF_WIFI_SORT = "pref_wifi_sort";


	/**
	 * Tile cache name for tiles downloaded from OSM
	 */
	public static final String TILE_CACHE_OSM = "OSM";
	
	/**
	 * Tile servers for Mapquest
	 */
	public static final String[] TILE_SERVER_OSM = {
		"a.tile.openstreetmap.org",
		"b.tile.openstreetmap.org",
		"c.tile.openstreetmap.org"
	};
	
	/**
	 * Tile URL for OSM (anything between server name and zoom level)
	 */
	public static final String TILE_URL_OSM = "";
	
	/**
	 * Tile extension for OSM
	 */
	public static final String TILE_EXTENSION_OSM = "png";


	/**
	 * Tile cache name for tiles rendered with internal render theme
	 */
	public static final String TILE_CACHE_INTERNAL_RENDER_THEME = "InternalRenderTheme";


	/**
	 * MIME type for HTML
	 */
	public static final String CONTENT_TYPE_HTML = "text/html";


	public static final String MAP_PATH_DEFAULT = new File(Environment.getExternalStorageDirectory(), "org.mapsforge/maps").getAbsolutePath();


	/**
	 * Key for a previously saved state of an {@code Activity} instance
	 */
	public static final String KEY_SAVED_INSTANCE_STATE = "savedInstanceState";
	
	/**
	 * Key for a {@link ResultReceiver}
	 */
	public static final String KEY_RESULT_RECEIVER = "resultReceiver";
	
	/**
	 * Key for an array of permissions
	 */
	public static final String KEY_PERMISSIONS = "permissions";
	
	/**
	 * Key for an array of permission grant results
	 */
	public static final String KEY_GRANT_RESULTS = "grantResults";
	
	/**
	 * Key for a request code
	 */
	public static final String KEY_REQUEST_CODE = "requestCode";
	
	/**
	 * Permission request when launching the map download dialog
	 */
	public static final int PERM_REQUEST_MAP_DOWNLOAD = 1;

	/**
	 * Permission request when registering phone state listener
	 */
	public static final int PERM_REQUEST_PHONE_STATE_LISTENER = 2;

	/**
	 * Permission request when refreshing AGPS data
	 */
	public static final int PERM_REQUEST_REFRESH_AGPS = 3;

	/**
	 * Permission request when requesting location updates
	 */
	public static final int PERM_REQUEST_LOCATION_UPDATES = 4;

	/**
	 * Permission request when requesting cell information
	 */
	public static final int PERM_REQUEST_CELL_INFO = 5;

	/**
	 * Permission request on startup (all UI permissions)
	 */
	public static final int PERM_REQUEST_STARTUP = 6;

	/**
	 * Permission request when using offline map
	 */
	public static final int PERM_REQUEST_OFFLINE_MAP = 7;
	
	/**
	 * Permission request for location access, sent via notification
	 */
	public static final int PERM_REQUEST_LOCATION_NOTIFICATION = 8;

	/**
	 * Permission request for location access made while changing settings
	 */
	public static final int PERM_REQUEST_LOCATION_PREF = 9;

	/**
	 * Highest numerical value currently defined for any {@code PERM_REQUEST} constant
	 */
	public static final int PERM_REQUEST_MAX = 9;

}
