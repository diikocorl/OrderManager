package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(databaseconnector.actions.ExecuteCallableStatement.class);
    registrator.registerUserAction(databaseconnector.actions.ExecuteParameterizedQuery.class);
    registrator.registerUserAction(databaseconnector.actions.ExecuteParameterizedStatement.class);
    registrator.registerUserAction(databaseconnector.actions.ExecuteQuery.class);
    registrator.registerUserAction(databaseconnector.actions.ExecuteStatement.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
