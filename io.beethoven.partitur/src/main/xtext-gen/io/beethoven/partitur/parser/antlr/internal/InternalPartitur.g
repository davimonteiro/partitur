/*
 * generated by Xtext 2.12.0
 */
grammar InternalPartitur;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package io.beethoven.partitur.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package io.beethoven.partitur.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.beethoven.partitur.services.PartiturGrammarAccess;

}

@parser::members {

 	private PartiturGrammarAccess grammarAccess;

    public InternalPartiturParser(TokenStream input, PartiturGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "PartiturWorkflow";
   	}

   	@Override
   	protected PartiturGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePartiturWorkflow
entryRulePartiturWorkflow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartiturWorkflowRule()); }
	iv_rulePartiturWorkflow=rulePartiturWorkflow
	{ $current=$iv_rulePartiturWorkflow.current; }
	EOF;

// Rule PartiturWorkflow
rulePartiturWorkflow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='workflow'
		{
			newLeafNode(otherlv_0, grammarAccess.getPartiturWorkflowAccess().getWorkflowKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPartiturWorkflowAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPartiturWorkflowRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPartiturWorkflowAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPartiturWorkflowAccess().getTasksPartiturTaskParserRuleCall_3_0());
				}
				lv_tasks_3_0=rulePartiturTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartiturWorkflowRule());
					}
					add(
						$current,
						"tasks",
						lv_tasks_3_0,
						"io.beethoven.partitur.Partitur.PartiturTask");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getPartiturWorkflowAccess().getHandlersPartiturHandlerParserRuleCall_4_0());
				}
				lv_handlers_4_0=rulePartiturHandler
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartiturWorkflowRule());
					}
					add(
						$current,
						"handlers",
						lv_handlers_4_0,
						"io.beethoven.partitur.Partitur.PartiturHandler");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPartiturWorkflowAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePartiturTask
entryRulePartiturTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartiturTaskRule()); }
	iv_rulePartiturTask=rulePartiturTask
	{ $current=$iv_rulePartiturTask.current; }
	EOF;

// Rule PartiturTask
rulePartiturTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='task'
		{
			newLeafNode(otherlv_0, grammarAccess.getPartiturTaskAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPartiturTaskAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPartiturTaskRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPartiturTaskAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpGetParserRuleCall_3_0_0());
					}
					lv_partiturHttpRequest_3_0=ruleHttpGet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
						}
						set(
							$current,
							"partiturHttpRequest",
							lv_partiturHttpRequest_3_0,
							"io.beethoven.partitur.Partitur.HttpGet");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPostParserRuleCall_3_1_0());
					}
					lv_partiturHttpRequest_4_0=ruleHttpPost
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
						}
						set(
							$current,
							"partiturHttpRequest",
							lv_partiturHttpRequest_4_0,
							"io.beethoven.partitur.Partitur.HttpPost");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPutParserRuleCall_3_2_0());
					}
					lv_partiturHttpRequest_5_0=ruleHttpPut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
						}
						set(
							$current,
							"partiturHttpRequest",
							lv_partiturHttpRequest_5_0,
							"io.beethoven.partitur.Partitur.HttpPut");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpDeleteParserRuleCall_3_3_0());
					}
					lv_partiturHttpRequest_6_0=ruleHttpDelete
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
						}
						set(
							$current,
							"partiturHttpRequest",
							lv_partiturHttpRequest_6_0,
							"io.beethoven.partitur.Partitur.HttpDelete");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getPartiturTaskAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePartiturHandler
entryRulePartiturHandler returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartiturHandlerRule()); }
	iv_rulePartiturHandler=rulePartiturHandler
	{ $current=$iv_rulePartiturHandler.current; }
	EOF;

// Rule PartiturHandler
rulePartiturHandler returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='handler'
		{
			newLeafNode(otherlv_0, grammarAccess.getPartiturHandlerAccess().getHandlerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPartiturHandlerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPartiturHandlerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPartiturHandlerAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getPartiturHandlerAccess().getOnKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPartiturHandlerAccess().getEventEventTypeEnumRuleCall_4_0());
				}
				lv_event_4_0=ruleEventType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
					}
					set(
						$current,
						"event",
						lv_event_4_0,
						"io.beethoven.partitur.Partitur.EventType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='when'
		{
			newLeafNode(otherlv_5, grammarAccess.getPartiturHandlerAccess().getWhenKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_6_0());
				}
				lv_conditions_6_0=rulePartiturCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
					}
					add(
						$current,
						"conditions",
						lv_conditions_6_0,
						"io.beethoven.partitur.Partitur.PartiturCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getPartiturHandlerAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_7_1_0());
					}
					lv_conditions_8_0=rulePartiturCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
						}
						add(
							$current,
							"conditions",
							lv_conditions_8_0,
							"io.beethoven.partitur.Partitur.PartiturCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='then'
		{
			newLeafNode(otherlv_9, grammarAccess.getPartiturHandlerAccess().getThenKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_9_0());
				}
				lv_commands_10_0=rulePartiturCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
					}
					add(
						$current,
						"commands",
						lv_commands_10_0,
						"io.beethoven.partitur.Partitur.PartiturCommand");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getPartiturHandlerAccess().getCommaKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_10_1_0());
					}
					lv_commands_12_0=rulePartiturCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
						}
						add(
							$current,
							"commands",
							lv_commands_12_0,
							"io.beethoven.partitur.Partitur.PartiturCommand");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getPartiturHandlerAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRulePartiturCondition
entryRulePartiturCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartiturConditionRule()); }
	iv_rulePartiturCondition=rulePartiturCondition
	{ $current=$iv_rulePartiturCondition.current; }
	EOF;

// Rule PartiturCondition
rulePartiturCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPartiturConditionAccess().getConditionFunctionPartiturConditionFunctionEnumRuleCall_0_0());
				}
				lv_conditionFunction_0_0=rulePartiturConditionFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartiturConditionRule());
					}
					set(
						$current,
						"conditionFunction",
						lv_conditionFunction_0_0,
						"io.beethoven.partitur.Partitur.PartiturConditionFunction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getPartiturConditionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_arg_2_0=RULE_STRING
				{
					newLeafNode(lv_arg_2_0, grammarAccess.getPartiturConditionAccess().getArgSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPartiturConditionRule());
					}
					setWithLastConsumed(
						$current,
						"arg",
						lv_arg_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getPartiturConditionAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRulePartiturCommand
entryRulePartiturCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPartiturCommandRule()); }
	iv_rulePartiturCommand=rulePartiturCommand
	{ $current=$iv_rulePartiturCommand.current; }
	EOF;

// Rule PartiturCommand
rulePartiturCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPartiturCommandAccess().getCommandFunctionPartiturCommandFunctionEnumRuleCall_0_0());
				}
				lv_commandFunction_0_0=rulePartiturCommandFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPartiturCommandRule());
					}
					set(
						$current,
						"commandFunction",
						lv_commandFunction_0_0,
						"io.beethoven.partitur.Partitur.PartiturCommandFunction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getPartiturCommandAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_arg_2_0=RULE_STRING
				{
					newLeafNode(lv_arg_2_0, grammarAccess.getPartiturCommandAccess().getArgSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPartiturCommandRule());
					}
					setWithLastConsumed(
						$current,
						"arg",
						lv_arg_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getPartiturCommandAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleHttpGet
entryRuleHttpGet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHttpGetRule()); }
	iv_ruleHttpGet=ruleHttpGet
	{ $current=$iv_ruleHttpGet.current; }
	EOF;

// Rule HttpGet
ruleHttpGet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='get'
		{
			newLeafNode(otherlv_0, grammarAccess.getHttpGetAccess().getGetKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getHttpGetAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_url_2_0=RULE_STRING
				{
					newLeafNode(lv_url_2_0, grammarAccess.getHttpGetAccess().getUrlSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpGetRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getHttpGetAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpGetAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
				}
				lv_uriVariables_4_0=ruleUriVariables
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpGetRule());
					}
					set(
						$current,
						"uriVariables",
						lv_uriVariables_4_0,
						"io.beethoven.partitur.Partitur.UriVariables");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpGetAccess().getHeadersHttpHeaderParserRuleCall_5_0());
				}
				lv_headers_5_0=ruleHttpHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpGetRule());
					}
					add(
						$current,
						"headers",
						lv_headers_5_0,
						"io.beethoven.partitur.Partitur.HttpHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpGetAccess().getParamsQueryParamParserRuleCall_6_0());
				}
				lv_params_6_0=ruleQueryParam
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpGetRule());
					}
					add(
						$current,
						"params",
						lv_params_6_0,
						"io.beethoven.partitur.Partitur.QueryParam");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleHttpPost
entryRuleHttpPost returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHttpPostRule()); }
	iv_ruleHttpPost=ruleHttpPost
	{ $current=$iv_ruleHttpPost.current; }
	EOF;

// Rule HttpPost
ruleHttpPost returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='post'
		{
			newLeafNode(otherlv_0, grammarAccess.getHttpPostAccess().getPostKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getHttpPostAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_url_2_0=RULE_STRING
				{
					newLeafNode(lv_url_2_0, grammarAccess.getHttpPostAccess().getUrlSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpPostRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getHttpPostAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpPostAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
				}
				lv_uriVariables_4_0=ruleUriVariables
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpPostRule());
					}
					set(
						$current,
						"uriVariables",
						lv_uriVariables_4_0,
						"io.beethoven.partitur.Partitur.UriVariables");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpPostAccess().getHeadersHttpHeaderParserRuleCall_5_0());
				}
				lv_headers_5_0=ruleHttpHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpPostRule());
					}
					add(
						$current,
						"headers",
						lv_headers_5_0,
						"io.beethoven.partitur.Partitur.HttpHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpPostAccess().getBodyHttpBodyParserRuleCall_6_0());
				}
				lv_body_6_0=ruleHttpBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpPostRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"io.beethoven.partitur.Partitur.HttpBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleHttpPut
entryRuleHttpPut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHttpPutRule()); }
	iv_ruleHttpPut=ruleHttpPut
	{ $current=$iv_ruleHttpPut.current; }
	EOF;

// Rule HttpPut
ruleHttpPut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='put'
		{
			newLeafNode(otherlv_0, grammarAccess.getHttpPutAccess().getPutKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getHttpPutAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_url_2_0=RULE_STRING
				{
					newLeafNode(lv_url_2_0, grammarAccess.getHttpPutAccess().getUrlSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpPutRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getHttpPutAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpPutAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
				}
				lv_uriVariables_4_0=ruleUriVariables
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpPutRule());
					}
					set(
						$current,
						"uriVariables",
						lv_uriVariables_4_0,
						"io.beethoven.partitur.Partitur.UriVariables");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpPutAccess().getHeadersHttpHeaderParserRuleCall_5_0());
				}
				lv_headers_5_0=ruleHttpHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpPutRule());
					}
					add(
						$current,
						"headers",
						lv_headers_5_0,
						"io.beethoven.partitur.Partitur.HttpHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpPutAccess().getBodyHttpBodyParserRuleCall_6_0());
				}
				lv_body_6_0=ruleHttpBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpPutRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"io.beethoven.partitur.Partitur.HttpBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleHttpDelete
entryRuleHttpDelete returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHttpDeleteRule()); }
	iv_ruleHttpDelete=ruleHttpDelete
	{ $current=$iv_ruleHttpDelete.current; }
	EOF;

// Rule HttpDelete
ruleHttpDelete returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='delete'
		{
			newLeafNode(otherlv_0, grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getHttpDeleteAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_url_2_0=RULE_STRING
				{
					newLeafNode(lv_url_2_0, grammarAccess.getHttpDeleteAccess().getUrlSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpDeleteRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getHttpDeleteAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpDeleteAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
				}
				lv_uriVariables_4_0=ruleUriVariables
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpDeleteRule());
					}
					set(
						$current,
						"uriVariables",
						lv_uriVariables_4_0,
						"io.beethoven.partitur.Partitur.UriVariables");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getHttpDeleteAccess().getHeadersHttpHeaderParserRuleCall_5_0());
				}
				lv_headers_5_0=ruleHttpHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHttpDeleteRule());
					}
					add(
						$current,
						"headers",
						lv_headers_5_0,
						"io.beethoven.partitur.Partitur.HttpHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleHttpHeader
entryRuleHttpHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHttpHeaderRule()); }
	iv_ruleHttpHeader=ruleHttpHeader
	{ $current=$iv_ruleHttpHeader.current; }
	EOF;

// Rule HttpHeader
ruleHttpHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.header('
		{
			newLeafNode(otherlv_0, grammarAccess.getHttpHeaderAccess().getHeaderKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getHttpHeaderAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getHttpHeaderAccess().getCommaKeyword_2());
		}
		(
			(
				lv_value_3_0=RULE_STRING
				{
					newLeafNode(lv_value_3_0, grammarAccess.getHttpHeaderAccess().getValueSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getHttpHeaderAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleUriVariables
entryRuleUriVariables returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUriVariablesRule()); }
	iv_ruleUriVariables=ruleUriVariables
	{ $current=$iv_ruleUriVariables.current; }
	EOF;

// Rule UriVariables
ruleUriVariables returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.uriVariables('
		{
			newLeafNode(otherlv_0, grammarAccess.getUriVariablesAccess().getUriVariablesKeyword_0());
		}
		(
			(
				lv_values_1_0=RULE_STRING
				{
					newLeafNode(lv_values_1_0, grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUriVariablesRule());
					}
					addWithLastConsumed(
						$current,
						"values",
						lv_values_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getUriVariablesAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_values_3_0=RULE_STRING
					{
						newLeafNode(lv_values_3_0, grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUriVariablesRule());
						}
						addWithLastConsumed(
							$current,
							"values",
							lv_values_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getUriVariablesAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleQueryParam
entryRuleQueryParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryParamRule()); }
	iv_ruleQueryParam=ruleQueryParam
	{ $current=$iv_ruleQueryParam.current; }
	EOF;

// Rule QueryParam
ruleQueryParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.queryParams('
		{
			newLeafNode(otherlv_0, grammarAccess.getQueryParamAccess().getQueryParamsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getQueryParamAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getQueryParamAccess().getCommaKeyword_2());
		}
		(
			(
				lv_value_3_0=RULE_STRING
				{
					newLeafNode(lv_value_3_0, grammarAccess.getQueryParamAccess().getValueSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryParamRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getQueryParamAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleHttpBody
entryRuleHttpBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHttpBodyRule()); }
	iv_ruleHttpBody=ruleHttpBody
	{ $current=$iv_ruleHttpBody.current; }
	EOF;

// Rule HttpBody
ruleHttpBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.body('
		{
			newLeafNode(otherlv_0, grammarAccess.getHttpBodyAccess().getBodyKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getHttpBodyAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHttpBodyRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getHttpBodyAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Rule PartiturConditionFunction
rulePartiturConditionFunction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='taskNameEqualsTo'
			{
				$current = grammarAccess.getPartiturConditionFunctionAccess().getTaskNameEqualsToEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPartiturConditionFunctionAccess().getTaskNameEqualsToEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='taskResponseEqualsTo'
			{
				$current = grammarAccess.getPartiturConditionFunctionAccess().getTaskResponseEqualsToEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPartiturConditionFunctionAccess().getTaskResponseEqualsToEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='workflowNameEqualsTo'
			{
				$current = grammarAccess.getPartiturConditionFunctionAccess().getWorkflowNameEqualsToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPartiturConditionFunctionAccess().getWorkflowNameEqualsToEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule PartiturCommandFunction
rulePartiturCommandFunction returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='startTask'
			{
				$current = grammarAccess.getPartiturCommandFunctionAccess().getStartTaskEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPartiturCommandFunctionAccess().getStartTaskEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='startWorkflow'
			{
				$current = grammarAccess.getPartiturCommandFunctionAccess().getStartWorkflowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPartiturCommandFunctionAccess().getStartWorkflowEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='stopWorkflow'
			{
				$current = grammarAccess.getPartiturCommandFunctionAccess().getStopWorkflowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPartiturCommandFunctionAccess().getStopWorkflowEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='cancelWorkflow'
			{
				$current = grammarAccess.getPartiturCommandFunctionAccess().getCancelWorkflowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPartiturCommandFunctionAccess().getCancelWorkflowEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule EventType
ruleEventType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='TASK_STARTED'
			{
				$current = grammarAccess.getEventTypeAccess().getTASK_STARTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getTASK_STARTEDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TASK_COMPLETED'
			{
				$current = grammarAccess.getEventTypeAccess().getTASK_COMPLETEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getTASK_COMPLETEDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='TASK_TIMEDOUT'
			{
				$current = grammarAccess.getEventTypeAccess().getTASK_TIMEDOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getTASK_TIMEDOUTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='TASK_FAILED'
			{
				$current = grammarAccess.getEventTypeAccess().getTASK_FAILEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getTASK_FAILEDEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='WORKFLOW_SCHEDULED'
			{
				$current = grammarAccess.getEventTypeAccess().getWORKFLOW_SCHEDULEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getWORKFLOW_SCHEDULEDEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='WORKFLOW_STARTED'
			{
				$current = grammarAccess.getEventTypeAccess().getWORKFLOW_STARTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getEventTypeAccess().getWORKFLOW_STARTEDEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='WORKFLOW_COMPLETED'
			{
				$current = grammarAccess.getEventTypeAccess().getWORKFLOW_COMPLETEDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getEventTypeAccess().getWORKFLOW_COMPLETEDEnumLiteralDeclaration_6());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
