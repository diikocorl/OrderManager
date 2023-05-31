// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class Workflow
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.Workflow";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Description("Description"),
		StartTime("StartTime"),
		EndTime("EndTime"),
		DueDate("DueDate"),
		CanBeRestarted("CanBeRestarted"),
		CanBeContinued("CanBeContinued"),
		State("State"),
		Reason("Reason"),
		Workflow_WorkflowDefinition("System.Workflow_WorkflowDefinition");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Workflow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Workflow(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowMendixObject)
	{
		if (workflowMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, workflowMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.workflowMendixObject = workflowMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Workflow.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.Workflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.Workflow.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static system.proxies.Workflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.Workflow(context, mendixObject);
	}

	public static system.proxies.Workflow load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.Workflow.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.Workflow> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> system.proxies.Workflow.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime()
	{
		return getStartTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartTime.toString());
	}

	/**
	 * Set value of StartTime
	 * @param starttime
	 */
	public final void setStartTime(java.util.Date starttime)
	{
		setStartTime(getContext(), starttime);
	}

	/**
	 * Set value of StartTime
	 * @param context
	 * @param starttime
	 */
	public final void setStartTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date starttime)
	{
		getMendixObject().setValue(context, MemberNames.StartTime.toString(), starttime);
	}

	/**
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime()
	{
		return getEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndTime.toString());
	}

	/**
	 * Set value of EndTime
	 * @param endtime
	 */
	public final void setEndTime(java.util.Date endtime)
	{
		setEndTime(getContext(), endtime);
	}

	/**
	 * Set value of EndTime
	 * @param context
	 * @param endtime
	 */
	public final void setEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date endtime)
	{
		getMendixObject().setValue(context, MemberNames.EndTime.toString(), endtime);
	}

	/**
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate()
	{
		return getDueDate(getContext());
	}

	/**
	 * @param context
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DueDate.toString());
	}

	/**
	 * Set value of DueDate
	 * @param duedate
	 */
	public final void setDueDate(java.util.Date duedate)
	{
		setDueDate(getContext(), duedate);
	}

	/**
	 * Set value of DueDate
	 * @param context
	 * @param duedate
	 */
	public final void setDueDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date duedate)
	{
		getMendixObject().setValue(context, MemberNames.DueDate.toString(), duedate);
	}

	/**
	 * @return value of CanBeRestarted
	 */
	public final java.lang.Boolean getCanBeRestarted()
	{
		return getCanBeRestarted(getContext());
	}

	/**
	 * @param context
	 * @return value of CanBeRestarted
	 */
	public final java.lang.Boolean getCanBeRestarted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CanBeRestarted.toString());
	}

	/**
	 * Set value of CanBeRestarted
	 * @param canberestarted
	 */
	public final void setCanBeRestarted(java.lang.Boolean canberestarted)
	{
		setCanBeRestarted(getContext(), canberestarted);
	}

	/**
	 * Set value of CanBeRestarted
	 * @param context
	 * @param canberestarted
	 */
	public final void setCanBeRestarted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean canberestarted)
	{
		getMendixObject().setValue(context, MemberNames.CanBeRestarted.toString(), canberestarted);
	}

	/**
	 * @return value of CanBeContinued
	 */
	public final java.lang.Boolean getCanBeContinued()
	{
		return getCanBeContinued(getContext());
	}

	/**
	 * @param context
	 * @return value of CanBeContinued
	 */
	public final java.lang.Boolean getCanBeContinued(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CanBeContinued.toString());
	}

	/**
	 * Set value of CanBeContinued
	 * @param canbecontinued
	 */
	public final void setCanBeContinued(java.lang.Boolean canbecontinued)
	{
		setCanBeContinued(getContext(), canbecontinued);
	}

	/**
	 * Set value of CanBeContinued
	 * @param context
	 * @param canbecontinued
	 */
	public final void setCanBeContinued(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean canbecontinued)
	{
		getMendixObject().setValue(context, MemberNames.CanBeContinued.toString(), canbecontinued);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final system.proxies.WorkflowState getState()
	{
		return getState(getContext());
	}

	/**
	 * @param context
	 * @return value of State
	 */
	public final system.proxies.WorkflowState getState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.State.toString());
		if (obj == null) {
			return null;
		}
		return system.proxies.WorkflowState.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final void setState(system.proxies.WorkflowState state)
	{
		setState(getContext(), state);
	}

	/**
	 * Set value of State
	 * @param context
	 * @param state
	 */
	public final void setState(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowState state)
	{
		if (state != null) {
			getMendixObject().setValue(context, MemberNames.State.toString(), state.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.State.toString(), null);
		}
	}

	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Workflow_WorkflowDefinition
	 */
	public final system.proxies.WorkflowDefinition getWorkflow_WorkflowDefinition() throws com.mendix.core.CoreException
	{
		return getWorkflow_WorkflowDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of Workflow_WorkflowDefinition
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.WorkflowDefinition getWorkflow_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Workflow_WorkflowDefinition.toString());
		if (identifier != null) {
			result = system.proxies.WorkflowDefinition.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Workflow_WorkflowDefinition
	 * @param workflow_workflowdefinition
	 */
	public final void setWorkflow_WorkflowDefinition(system.proxies.WorkflowDefinition workflow_workflowdefinition)
	{
		setWorkflow_WorkflowDefinition(getContext(), workflow_workflowdefinition);
	}

	/**
	 * Set value of Workflow_WorkflowDefinition
	 * @param context
	 * @param workflow_workflowdefinition
	 */
	public final void setWorkflow_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowDefinition workflow_workflowdefinition)
	{
		if (workflow_workflowdefinition == null) {
			getMendixObject().setValue(context, MemberNames.Workflow_WorkflowDefinition.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Workflow_WorkflowDefinition.toString(), workflow_workflowdefinition.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.Workflow that = (system.proxies.Workflow) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
