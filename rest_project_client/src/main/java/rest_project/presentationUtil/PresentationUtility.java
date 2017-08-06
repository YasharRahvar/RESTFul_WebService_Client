/**
 * Project: rest_project_client
 * File: PresentationUtility.java
 * Date: Jul 24, 2017
 * Time: 11:09:34 PM
 */

package rest_project.presentationUtil;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author Yashar Rahvar
 *
 */
public class PresentationUtility {
	private static final String BUNDLE_NAME = "employees-presentation";
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle( BUNDLE_NAME );
	
	public static String getString( String key )
	{
		try
		{
			if ( System.getenv( key ) != null )
			{
				return System.getenv( key );
			}
			return RESOURCE_BUNDLE.getString( key );
		}
		catch ( MissingResourceException e )
		{
			System.err.println( "Unable to find key [" + key + "] in " + BUNDLE_NAME );
			return '!' + key + '!';
		}
	}

	public static String getString( String key, Object... args )
	{
		try
		{
			if ( System.getenv( key ) != null )
			{
				return System.getenv( key );
			}
			String s = RESOURCE_BUNDLE.getString( key );
			return MessageFormat.format( s, args );
		}
		catch ( MissingResourceException e )
		{
			System.err.println( "Unable to find key [" + key + "] in " + BUNDLE_NAME );
			return '!' + key + '!';
		}
	}

}

