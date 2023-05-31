// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package databaseconnector.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import databaseconnector.impl.JdbcConnector;

/**
 * For a more detailed documentation, please visit the website at
 * https://docs.mendix.com/appstore/connectors/database-connector
 * 
 * This Java action provides a consistent environment for Mendix projects to
 * perform arbitrary parameterized SQL statements on external relational
 * databases. The statement text may contain placeholders to be filled in with
 * values directly from Mendix.
 * 
 * Do not use this Java action for SELECT queries. This action returns the
 * number of affected rows.
 * 
 * The JDBC drivers for the databases you want to connect to must be placed
 * inside the userlib directory of your project.
 * 
 * Note: While the text parameters are properly escaped, proper security is still
 *       required when manually composing the parameterized template text to avoid
 *       SQL injection.
 * 
 * @param jdbcUrl A database JDBC URL address that points to your database.
 * 
 * @param userName The user name for logging into the database.
 * 
 * @param password The password for logging into the database.
 * 
 * @param sql A string template containing the SQL statement to be performed and the
 *            statement parameters.
 * 
 * @return Number of affected rows.
 */
public class ExecuteParameterizedStatement extends CustomJavaAction<java.lang.Long>
{
	private java.lang.String jdbcUrl;
	private java.lang.String userName;
	private java.lang.String password;
	private com.mendix.systemwideinterfaces.javaactions.parameters.IStringTemplate sql;

	public ExecuteParameterizedStatement(IContext context, java.lang.String jdbcUrl, java.lang.String userName, java.lang.String password, com.mendix.systemwideinterfaces.javaactions.parameters.IStringTemplate sql)
	{
		super(context);
		this.jdbcUrl = jdbcUrl;
		this.userName = userName;
		this.password = password;
		this.sql = sql;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		return connector.executeStatement(jdbcUrl, userName, password, sql);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ExecuteParameterizedStatement";
	}

	// BEGIN EXTRA CODE
	private final ILogNode logNode = Core.getLogger(this.getClass().getName());

	private final JdbcConnector connector = new JdbcConnector(logNode);
	// END EXTRA CODE
}
