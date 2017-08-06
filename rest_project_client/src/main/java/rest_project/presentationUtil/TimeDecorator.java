/**
 * Project: rest_project_client
 * File: TimeDecorator.java
 * Date: Jul 25, 2017
 * Time: 12:35:15 PM
 */

package rest_project.presentationUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.displaytag.decorator.TableDecorator;

import rest_project.jpa.entity.Employee;

/**
 * @author Yashar Rahvar
 *
 */
public class TimeDecorator extends TableDecorator 
{
	public String getDob()
	{
		Date dob = ( (Employee ) ( this.getCurrentRowObject()) ).getDob();
		if ( dob==null || "".equals( dob ) )
		{
			return "";
		}
		
		DateFormat formatter = new SimpleDateFormat( "yyyy/MM/dd" );
		return formatter.format(dob);
	}
}
