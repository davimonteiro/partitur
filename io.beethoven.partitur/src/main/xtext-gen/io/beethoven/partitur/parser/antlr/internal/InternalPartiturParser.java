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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPartiturParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'workflow'", "'{'", "'}'", "'task'", "'handler'", "'on'", "'when'", "','", "'then'", "'('", "')'", "'get'", "'post'", "'put'", "'delete'", "'.header('", "'.uriVariables('", "'.queryParams('", "'.body('", "'taskNameEqualsTo'", "'taskResponseEqualsTo'", "'workflowNameEqualsTo'", "'startTask'", "'startWorkflow'", "'stopWorkflow'", "'cancelWorkflow'", "'TASK_STARTED'", "'TASK_COMPLETED'", "'TASK_TIMEDOUT'", "'TASK_FAILED'", "'WORKFLOW_SCHEDULED'", "'WORKFLOW_STARTED'", "'WORKFLOW_COMPLETED'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPartiturParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPartiturParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPartiturParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPartitur.g"; }



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




    // $ANTLR start "entryRulePartiturWorkflow"
    // InternalPartitur.g:65:1: entryRulePartiturWorkflow returns [EObject current=null] : iv_rulePartiturWorkflow= rulePartiturWorkflow EOF ;
    public final EObject entryRulePartiturWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartiturWorkflow = null;


        try {
            // InternalPartitur.g:65:57: (iv_rulePartiturWorkflow= rulePartiturWorkflow EOF )
            // InternalPartitur.g:66:2: iv_rulePartiturWorkflow= rulePartiturWorkflow EOF
            {
             newCompositeNode(grammarAccess.getPartiturWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartiturWorkflow=rulePartiturWorkflow();

            state._fsp--;

             current =iv_rulePartiturWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartiturWorkflow"


    // $ANTLR start "rulePartiturWorkflow"
    // InternalPartitur.g:72:1: rulePartiturWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= rulePartiturTask ) )* ( (lv_handlers_4_0= rulePartiturHandler ) )* otherlv_5= '}' ) ;
    public final EObject rulePartiturWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_tasks_3_0 = null;

        EObject lv_handlers_4_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:78:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= rulePartiturTask ) )* ( (lv_handlers_4_0= rulePartiturHandler ) )* otherlv_5= '}' ) )
            // InternalPartitur.g:79:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= rulePartiturTask ) )* ( (lv_handlers_4_0= rulePartiturHandler ) )* otherlv_5= '}' )
            {
            // InternalPartitur.g:79:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= rulePartiturTask ) )* ( (lv_handlers_4_0= rulePartiturHandler ) )* otherlv_5= '}' )
            // InternalPartitur.g:80:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= rulePartiturTask ) )* ( (lv_handlers_4_0= rulePartiturHandler ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPartiturWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalPartitur.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPartitur.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPartitur.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalPartitur.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartiturWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartiturWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPartiturWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPartitur.g:106:3: ( (lv_tasks_3_0= rulePartiturTask ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPartitur.g:107:4: (lv_tasks_3_0= rulePartiturTask )
            	    {
            	    // InternalPartitur.g:107:4: (lv_tasks_3_0= rulePartiturTask )
            	    // InternalPartitur.g:108:5: lv_tasks_3_0= rulePartiturTask
            	    {

            	    					newCompositeNode(grammarAccess.getPartiturWorkflowAccess().getTasksPartiturTaskParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tasks_3_0=rulePartiturTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartiturWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_3_0,
            	    						"io.beethoven.partitur.Partitur.PartiturTask");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPartitur.g:125:3: ( (lv_handlers_4_0= rulePartiturHandler ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPartitur.g:126:4: (lv_handlers_4_0= rulePartiturHandler )
            	    {
            	    // InternalPartitur.g:126:4: (lv_handlers_4_0= rulePartiturHandler )
            	    // InternalPartitur.g:127:5: lv_handlers_4_0= rulePartiturHandler
            	    {

            	    					newCompositeNode(grammarAccess.getPartiturWorkflowAccess().getHandlersPartiturHandlerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_handlers_4_0=rulePartiturHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartiturWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"handlers",
            	    						lv_handlers_4_0,
            	    						"io.beethoven.partitur.Partitur.PartiturHandler");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPartiturWorkflowAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartiturWorkflow"


    // $ANTLR start "entryRulePartiturTask"
    // InternalPartitur.g:152:1: entryRulePartiturTask returns [EObject current=null] : iv_rulePartiturTask= rulePartiturTask EOF ;
    public final EObject entryRulePartiturTask() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartiturTask = null;


        try {
            // InternalPartitur.g:152:53: (iv_rulePartiturTask= rulePartiturTask EOF )
            // InternalPartitur.g:153:2: iv_rulePartiturTask= rulePartiturTask EOF
            {
             newCompositeNode(grammarAccess.getPartiturTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartiturTask=rulePartiturTask();

            state._fsp--;

             current =iv_rulePartiturTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartiturTask"


    // $ANTLR start "rulePartiturTask"
    // InternalPartitur.g:159:1: rulePartiturTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) ) | ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) ) | ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) ) | ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) ) ) otherlv_7= '}' ) ;
    public final EObject rulePartiturTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_partiturHttpRequest_3_0 = null;

        EObject lv_partiturHttpRequest_4_0 = null;

        EObject lv_partiturHttpRequest_5_0 = null;

        EObject lv_partiturHttpRequest_6_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:165:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) ) | ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) ) | ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) ) | ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) ) ) otherlv_7= '}' ) )
            // InternalPartitur.g:166:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) ) | ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) ) | ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) ) | ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) ) ) otherlv_7= '}' )
            {
            // InternalPartitur.g:166:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) ) | ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) ) | ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) ) | ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) ) ) otherlv_7= '}' )
            // InternalPartitur.g:167:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) ) | ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) ) | ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) ) | ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPartiturTaskAccess().getTaskKeyword_0());
            		
            // InternalPartitur.g:171:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPartitur.g:172:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPartitur.g:172:4: (lv_name_1_0= RULE_ID )
            // InternalPartitur.g:173:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartiturTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartiturTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPartiturTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPartitur.g:193:3: ( ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) ) | ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) ) | ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) ) | ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPartitur.g:194:4: ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) )
                    {
                    // InternalPartitur.g:194:4: ( (lv_partiturHttpRequest_3_0= ruleHttpGet ) )
                    // InternalPartitur.g:195:5: (lv_partiturHttpRequest_3_0= ruleHttpGet )
                    {
                    // InternalPartitur.g:195:5: (lv_partiturHttpRequest_3_0= ruleHttpGet )
                    // InternalPartitur.g:196:6: lv_partiturHttpRequest_3_0= ruleHttpGet
                    {

                    						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpGetParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_partiturHttpRequest_3_0=ruleHttpGet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
                    						}
                    						set(
                    							current,
                    							"partiturHttpRequest",
                    							lv_partiturHttpRequest_3_0,
                    							"io.beethoven.partitur.Partitur.HttpGet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:214:4: ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) )
                    {
                    // InternalPartitur.g:214:4: ( (lv_partiturHttpRequest_4_0= ruleHttpPost ) )
                    // InternalPartitur.g:215:5: (lv_partiturHttpRequest_4_0= ruleHttpPost )
                    {
                    // InternalPartitur.g:215:5: (lv_partiturHttpRequest_4_0= ruleHttpPost )
                    // InternalPartitur.g:216:6: lv_partiturHttpRequest_4_0= ruleHttpPost
                    {

                    						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPostParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_partiturHttpRequest_4_0=ruleHttpPost();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
                    						}
                    						set(
                    							current,
                    							"partiturHttpRequest",
                    							lv_partiturHttpRequest_4_0,
                    							"io.beethoven.partitur.Partitur.HttpPost");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:234:4: ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) )
                    {
                    // InternalPartitur.g:234:4: ( (lv_partiturHttpRequest_5_0= ruleHttpPut ) )
                    // InternalPartitur.g:235:5: (lv_partiturHttpRequest_5_0= ruleHttpPut )
                    {
                    // InternalPartitur.g:235:5: (lv_partiturHttpRequest_5_0= ruleHttpPut )
                    // InternalPartitur.g:236:6: lv_partiturHttpRequest_5_0= ruleHttpPut
                    {

                    						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPutParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_partiturHttpRequest_5_0=ruleHttpPut();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
                    						}
                    						set(
                    							current,
                    							"partiturHttpRequest",
                    							lv_partiturHttpRequest_5_0,
                    							"io.beethoven.partitur.Partitur.HttpPut");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPartitur.g:254:4: ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) )
                    {
                    // InternalPartitur.g:254:4: ( (lv_partiturHttpRequest_6_0= ruleHttpDelete ) )
                    // InternalPartitur.g:255:5: (lv_partiturHttpRequest_6_0= ruleHttpDelete )
                    {
                    // InternalPartitur.g:255:5: (lv_partiturHttpRequest_6_0= ruleHttpDelete )
                    // InternalPartitur.g:256:6: lv_partiturHttpRequest_6_0= ruleHttpDelete
                    {

                    						newCompositeNode(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpDeleteParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_partiturHttpRequest_6_0=ruleHttpDelete();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartiturTaskRule());
                    						}
                    						set(
                    							current,
                    							"partiturHttpRequest",
                    							lv_partiturHttpRequest_6_0,
                    							"io.beethoven.partitur.Partitur.HttpDelete");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPartiturTaskAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartiturTask"


    // $ANTLR start "entryRulePartiturHandler"
    // InternalPartitur.g:282:1: entryRulePartiturHandler returns [EObject current=null] : iv_rulePartiturHandler= rulePartiturHandler EOF ;
    public final EObject entryRulePartiturHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartiturHandler = null;


        try {
            // InternalPartitur.g:282:56: (iv_rulePartiturHandler= rulePartiturHandler EOF )
            // InternalPartitur.g:283:2: iv_rulePartiturHandler= rulePartiturHandler EOF
            {
             newCompositeNode(grammarAccess.getPartiturHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartiturHandler=rulePartiturHandler();

            state._fsp--;

             current =iv_rulePartiturHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartiturHandler"


    // $ANTLR start "rulePartiturHandler"
    // InternalPartitur.g:289:1: rulePartiturHandler returns [EObject current=null] : (otherlv_0= 'handler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'on' ( (lv_event_4_0= ruleEventType ) ) otherlv_5= 'when' ( (lv_conditions_6_0= rulePartiturCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= rulePartiturCondition ) ) )* otherlv_9= 'then' ( (lv_commands_10_0= rulePartiturCommand ) ) (otherlv_11= ',' ( (lv_commands_12_0= rulePartiturCommand ) ) )* otherlv_13= '}' ) ;
    public final EObject rulePartiturHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_event_4_0 = null;

        EObject lv_conditions_6_0 = null;

        EObject lv_conditions_8_0 = null;

        EObject lv_commands_10_0 = null;

        EObject lv_commands_12_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:295:2: ( (otherlv_0= 'handler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'on' ( (lv_event_4_0= ruleEventType ) ) otherlv_5= 'when' ( (lv_conditions_6_0= rulePartiturCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= rulePartiturCondition ) ) )* otherlv_9= 'then' ( (lv_commands_10_0= rulePartiturCommand ) ) (otherlv_11= ',' ( (lv_commands_12_0= rulePartiturCommand ) ) )* otherlv_13= '}' ) )
            // InternalPartitur.g:296:2: (otherlv_0= 'handler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'on' ( (lv_event_4_0= ruleEventType ) ) otherlv_5= 'when' ( (lv_conditions_6_0= rulePartiturCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= rulePartiturCondition ) ) )* otherlv_9= 'then' ( (lv_commands_10_0= rulePartiturCommand ) ) (otherlv_11= ',' ( (lv_commands_12_0= rulePartiturCommand ) ) )* otherlv_13= '}' )
            {
            // InternalPartitur.g:296:2: (otherlv_0= 'handler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'on' ( (lv_event_4_0= ruleEventType ) ) otherlv_5= 'when' ( (lv_conditions_6_0= rulePartiturCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= rulePartiturCondition ) ) )* otherlv_9= 'then' ( (lv_commands_10_0= rulePartiturCommand ) ) (otherlv_11= ',' ( (lv_commands_12_0= rulePartiturCommand ) ) )* otherlv_13= '}' )
            // InternalPartitur.g:297:3: otherlv_0= 'handler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'on' ( (lv_event_4_0= ruleEventType ) ) otherlv_5= 'when' ( (lv_conditions_6_0= rulePartiturCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= rulePartiturCondition ) ) )* otherlv_9= 'then' ( (lv_commands_10_0= rulePartiturCommand ) ) (otherlv_11= ',' ( (lv_commands_12_0= rulePartiturCommand ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPartiturHandlerAccess().getHandlerKeyword_0());
            		
            // InternalPartitur.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPartitur.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPartitur.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalPartitur.g:303:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartiturHandlerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartiturHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPartiturHandlerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPartiturHandlerAccess().getOnKeyword_3());
            		
            // InternalPartitur.g:327:3: ( (lv_event_4_0= ruleEventType ) )
            // InternalPartitur.g:328:4: (lv_event_4_0= ruleEventType )
            {
            // InternalPartitur.g:328:4: (lv_event_4_0= ruleEventType )
            // InternalPartitur.g:329:5: lv_event_4_0= ruleEventType
            {

            					newCompositeNode(grammarAccess.getPartiturHandlerAccess().getEventEventTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_event_4_0=ruleEventType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_4_0,
            						"io.beethoven.partitur.Partitur.EventType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPartiturHandlerAccess().getWhenKeyword_5());
            		
            // InternalPartitur.g:350:3: ( (lv_conditions_6_0= rulePartiturCondition ) )
            // InternalPartitur.g:351:4: (lv_conditions_6_0= rulePartiturCondition )
            {
            // InternalPartitur.g:351:4: (lv_conditions_6_0= rulePartiturCondition )
            // InternalPartitur.g:352:5: lv_conditions_6_0= rulePartiturCondition
            {

            					newCompositeNode(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_conditions_6_0=rulePartiturCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_6_0,
            						"io.beethoven.partitur.Partitur.PartiturCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPartitur.g:369:3: (otherlv_7= ',' ( (lv_conditions_8_0= rulePartiturCondition ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPartitur.g:370:4: otherlv_7= ',' ( (lv_conditions_8_0= rulePartiturCondition ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPartiturHandlerAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalPartitur.g:374:4: ( (lv_conditions_8_0= rulePartiturCondition ) )
            	    // InternalPartitur.g:375:5: (lv_conditions_8_0= rulePartiturCondition )
            	    {
            	    // InternalPartitur.g:375:5: (lv_conditions_8_0= rulePartiturCondition )
            	    // InternalPartitur.g:376:6: lv_conditions_8_0= rulePartiturCondition
            	    {

            	    						newCompositeNode(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_conditions_8_0=rulePartiturCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_8_0,
            	    							"io.beethoven.partitur.Partitur.PartiturCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getPartiturHandlerAccess().getThenKeyword_8());
            		
            // InternalPartitur.g:398:3: ( (lv_commands_10_0= rulePartiturCommand ) )
            // InternalPartitur.g:399:4: (lv_commands_10_0= rulePartiturCommand )
            {
            // InternalPartitur.g:399:4: (lv_commands_10_0= rulePartiturCommand )
            // InternalPartitur.g:400:5: lv_commands_10_0= rulePartiturCommand
            {

            					newCompositeNode(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_15);
            lv_commands_10_0=rulePartiturCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
            					}
            					add(
            						current,
            						"commands",
            						lv_commands_10_0,
            						"io.beethoven.partitur.Partitur.PartiturCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPartitur.g:417:3: (otherlv_11= ',' ( (lv_commands_12_0= rulePartiturCommand ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPartitur.g:418:4: otherlv_11= ',' ( (lv_commands_12_0= rulePartiturCommand ) )
            	    {
            	    otherlv_11=(Token)match(input,18,FOLLOW_14); 

            	    				newLeafNode(otherlv_11, grammarAccess.getPartiturHandlerAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalPartitur.g:422:4: ( (lv_commands_12_0= rulePartiturCommand ) )
            	    // InternalPartitur.g:423:5: (lv_commands_12_0= rulePartiturCommand )
            	    {
            	    // InternalPartitur.g:423:5: (lv_commands_12_0= rulePartiturCommand )
            	    // InternalPartitur.g:424:6: lv_commands_12_0= rulePartiturCommand
            	    {

            	    						newCompositeNode(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_commands_12_0=rulePartiturCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPartiturHandlerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_12_0,
            	    							"io.beethoven.partitur.Partitur.PartiturCommand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPartiturHandlerAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartiturHandler"


    // $ANTLR start "entryRulePartiturCondition"
    // InternalPartitur.g:450:1: entryRulePartiturCondition returns [EObject current=null] : iv_rulePartiturCondition= rulePartiturCondition EOF ;
    public final EObject entryRulePartiturCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartiturCondition = null;


        try {
            // InternalPartitur.g:450:58: (iv_rulePartiturCondition= rulePartiturCondition EOF )
            // InternalPartitur.g:451:2: iv_rulePartiturCondition= rulePartiturCondition EOF
            {
             newCompositeNode(grammarAccess.getPartiturConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartiturCondition=rulePartiturCondition();

            state._fsp--;

             current =iv_rulePartiturCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartiturCondition"


    // $ANTLR start "rulePartiturCondition"
    // InternalPartitur.g:457:1: rulePartiturCondition returns [EObject current=null] : ( ( (lv_conditionFunction_0_0= rulePartiturConditionFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject rulePartiturCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_arg_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_conditionFunction_0_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:463:2: ( ( ( (lv_conditionFunction_0_0= rulePartiturConditionFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalPartitur.g:464:2: ( ( (lv_conditionFunction_0_0= rulePartiturConditionFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalPartitur.g:464:2: ( ( (lv_conditionFunction_0_0= rulePartiturConditionFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalPartitur.g:465:3: ( (lv_conditionFunction_0_0= rulePartiturConditionFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalPartitur.g:465:3: ( (lv_conditionFunction_0_0= rulePartiturConditionFunction ) )
            // InternalPartitur.g:466:4: (lv_conditionFunction_0_0= rulePartiturConditionFunction )
            {
            // InternalPartitur.g:466:4: (lv_conditionFunction_0_0= rulePartiturConditionFunction )
            // InternalPartitur.g:467:5: lv_conditionFunction_0_0= rulePartiturConditionFunction
            {

            					newCompositeNode(grammarAccess.getPartiturConditionAccess().getConditionFunctionPartiturConditionFunctionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_conditionFunction_0_0=rulePartiturConditionFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartiturConditionRule());
            					}
            					set(
            						current,
            						"conditionFunction",
            						lv_conditionFunction_0_0,
            						"io.beethoven.partitur.Partitur.PartiturConditionFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPartiturConditionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPartitur.g:488:3: ( (lv_arg_2_0= RULE_STRING ) )
            // InternalPartitur.g:489:4: (lv_arg_2_0= RULE_STRING )
            {
            // InternalPartitur.g:489:4: (lv_arg_2_0= RULE_STRING )
            // InternalPartitur.g:490:5: lv_arg_2_0= RULE_STRING
            {
            lv_arg_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_arg_2_0, grammarAccess.getPartiturConditionAccess().getArgSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartiturConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arg",
            						lv_arg_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPartiturConditionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartiturCondition"


    // $ANTLR start "entryRulePartiturCommand"
    // InternalPartitur.g:514:1: entryRulePartiturCommand returns [EObject current=null] : iv_rulePartiturCommand= rulePartiturCommand EOF ;
    public final EObject entryRulePartiturCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartiturCommand = null;


        try {
            // InternalPartitur.g:514:56: (iv_rulePartiturCommand= rulePartiturCommand EOF )
            // InternalPartitur.g:515:2: iv_rulePartiturCommand= rulePartiturCommand EOF
            {
             newCompositeNode(grammarAccess.getPartiturCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartiturCommand=rulePartiturCommand();

            state._fsp--;

             current =iv_rulePartiturCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartiturCommand"


    // $ANTLR start "rulePartiturCommand"
    // InternalPartitur.g:521:1: rulePartiturCommand returns [EObject current=null] : ( ( (lv_commandFunction_0_0= rulePartiturCommandFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject rulePartiturCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_arg_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_commandFunction_0_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:527:2: ( ( ( (lv_commandFunction_0_0= rulePartiturCommandFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalPartitur.g:528:2: ( ( (lv_commandFunction_0_0= rulePartiturCommandFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalPartitur.g:528:2: ( ( (lv_commandFunction_0_0= rulePartiturCommandFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalPartitur.g:529:3: ( (lv_commandFunction_0_0= rulePartiturCommandFunction ) ) otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalPartitur.g:529:3: ( (lv_commandFunction_0_0= rulePartiturCommandFunction ) )
            // InternalPartitur.g:530:4: (lv_commandFunction_0_0= rulePartiturCommandFunction )
            {
            // InternalPartitur.g:530:4: (lv_commandFunction_0_0= rulePartiturCommandFunction )
            // InternalPartitur.g:531:5: lv_commandFunction_0_0= rulePartiturCommandFunction
            {

            					newCompositeNode(grammarAccess.getPartiturCommandAccess().getCommandFunctionPartiturCommandFunctionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_commandFunction_0_0=rulePartiturCommandFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartiturCommandRule());
            					}
            					set(
            						current,
            						"commandFunction",
            						lv_commandFunction_0_0,
            						"io.beethoven.partitur.Partitur.PartiturCommandFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPartiturCommandAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPartitur.g:552:3: ( (lv_arg_2_0= RULE_STRING ) )
            // InternalPartitur.g:553:4: (lv_arg_2_0= RULE_STRING )
            {
            // InternalPartitur.g:553:4: (lv_arg_2_0= RULE_STRING )
            // InternalPartitur.g:554:5: lv_arg_2_0= RULE_STRING
            {
            lv_arg_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_arg_2_0, grammarAccess.getPartiturCommandAccess().getArgSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartiturCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arg",
            						lv_arg_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPartiturCommandAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartiturCommand"


    // $ANTLR start "entryRuleHttpGet"
    // InternalPartitur.g:578:1: entryRuleHttpGet returns [EObject current=null] : iv_ruleHttpGet= ruleHttpGet EOF ;
    public final EObject entryRuleHttpGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpGet = null;


        try {
            // InternalPartitur.g:578:48: (iv_ruleHttpGet= ruleHttpGet EOF )
            // InternalPartitur.g:579:2: iv_ruleHttpGet= ruleHttpGet EOF
            {
             newCompositeNode(grammarAccess.getHttpGetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpGet=ruleHttpGet();

            state._fsp--;

             current =iv_ruleHttpGet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpGet"


    // $ANTLR start "ruleHttpGet"
    // InternalPartitur.g:585:1: ruleHttpGet returns [EObject current=null] : (otherlv_0= 'get' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_params_6_0= ruleQueryParam ) )* ) ;
    public final EObject ruleHttpGet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        EObject lv_uriVariables_4_0 = null;

        EObject lv_headers_5_0 = null;

        EObject lv_params_6_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:591:2: ( (otherlv_0= 'get' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_params_6_0= ruleQueryParam ) )* ) )
            // InternalPartitur.g:592:2: (otherlv_0= 'get' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_params_6_0= ruleQueryParam ) )* )
            {
            // InternalPartitur.g:592:2: (otherlv_0= 'get' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_params_6_0= ruleQueryParam ) )* )
            // InternalPartitur.g:593:3: otherlv_0= 'get' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_params_6_0= ruleQueryParam ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getHttpGetAccess().getGetKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHttpGetAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPartitur.g:601:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalPartitur.g:602:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalPartitur.g:602:4: (lv_url_2_0= RULE_STRING )
            // InternalPartitur.g:603:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_url_2_0, grammarAccess.getHttpGetAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpGetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getHttpGetAccess().getRightParenthesisKeyword_3());
            		
            // InternalPartitur.g:623:3: ( (lv_uriVariables_4_0= ruleUriVariables ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPartitur.g:624:4: (lv_uriVariables_4_0= ruleUriVariables )
                    {
                    // InternalPartitur.g:624:4: (lv_uriVariables_4_0= ruleUriVariables )
                    // InternalPartitur.g:625:5: lv_uriVariables_4_0= ruleUriVariables
                    {

                    					newCompositeNode(grammarAccess.getHttpGetAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_uriVariables_4_0=ruleUriVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHttpGetRule());
                    					}
                    					set(
                    						current,
                    						"uriVariables",
                    						lv_uriVariables_4_0,
                    						"io.beethoven.partitur.Partitur.UriVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPartitur.g:642:3: ( (lv_headers_5_0= ruleHttpHeader ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPartitur.g:643:4: (lv_headers_5_0= ruleHttpHeader )
            	    {
            	    // InternalPartitur.g:643:4: (lv_headers_5_0= ruleHttpHeader )
            	    // InternalPartitur.g:644:5: lv_headers_5_0= ruleHttpHeader
            	    {

            	    					newCompositeNode(grammarAccess.getHttpGetAccess().getHeadersHttpHeaderParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_headers_5_0=ruleHttpHeader();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHttpGetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"headers",
            	    						lv_headers_5_0,
            	    						"io.beethoven.partitur.Partitur.HttpHeader");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalPartitur.g:661:3: ( (lv_params_6_0= ruleQueryParam ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPartitur.g:662:4: (lv_params_6_0= ruleQueryParam )
            	    {
            	    // InternalPartitur.g:662:4: (lv_params_6_0= ruleQueryParam )
            	    // InternalPartitur.g:663:5: lv_params_6_0= ruleQueryParam
            	    {

            	    					newCompositeNode(grammarAccess.getHttpGetAccess().getParamsQueryParamParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_params_6_0=ruleQueryParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHttpGetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_6_0,
            	    						"io.beethoven.partitur.Partitur.QueryParam");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpGet"


    // $ANTLR start "entryRuleHttpPost"
    // InternalPartitur.g:684:1: entryRuleHttpPost returns [EObject current=null] : iv_ruleHttpPost= ruleHttpPost EOF ;
    public final EObject entryRuleHttpPost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpPost = null;


        try {
            // InternalPartitur.g:684:49: (iv_ruleHttpPost= ruleHttpPost EOF )
            // InternalPartitur.g:685:2: iv_ruleHttpPost= ruleHttpPost EOF
            {
             newCompositeNode(grammarAccess.getHttpPostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpPost=ruleHttpPost();

            state._fsp--;

             current =iv_ruleHttpPost; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpPost"


    // $ANTLR start "ruleHttpPost"
    // InternalPartitur.g:691:1: ruleHttpPost returns [EObject current=null] : (otherlv_0= 'post' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? ) ;
    public final EObject ruleHttpPost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        EObject lv_uriVariables_4_0 = null;

        EObject lv_headers_5_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:697:2: ( (otherlv_0= 'post' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? ) )
            // InternalPartitur.g:698:2: (otherlv_0= 'post' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? )
            {
            // InternalPartitur.g:698:2: (otherlv_0= 'post' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? )
            // InternalPartitur.g:699:3: otherlv_0= 'post' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getHttpPostAccess().getPostKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHttpPostAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPartitur.g:707:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalPartitur.g:708:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalPartitur.g:708:4: (lv_url_2_0= RULE_STRING )
            // InternalPartitur.g:709:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_url_2_0, grammarAccess.getHttpPostAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpPostRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getHttpPostAccess().getRightParenthesisKeyword_3());
            		
            // InternalPartitur.g:729:3: ( (lv_uriVariables_4_0= ruleUriVariables ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPartitur.g:730:4: (lv_uriVariables_4_0= ruleUriVariables )
                    {
                    // InternalPartitur.g:730:4: (lv_uriVariables_4_0= ruleUriVariables )
                    // InternalPartitur.g:731:5: lv_uriVariables_4_0= ruleUriVariables
                    {

                    					newCompositeNode(grammarAccess.getHttpPostAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_uriVariables_4_0=ruleUriVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHttpPostRule());
                    					}
                    					set(
                    						current,
                    						"uriVariables",
                    						lv_uriVariables_4_0,
                    						"io.beethoven.partitur.Partitur.UriVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPartitur.g:748:3: ( (lv_headers_5_0= ruleHttpHeader ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPartitur.g:749:4: (lv_headers_5_0= ruleHttpHeader )
            	    {
            	    // InternalPartitur.g:749:4: (lv_headers_5_0= ruleHttpHeader )
            	    // InternalPartitur.g:750:5: lv_headers_5_0= ruleHttpHeader
            	    {

            	    					newCompositeNode(grammarAccess.getHttpPostAccess().getHeadersHttpHeaderParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_headers_5_0=ruleHttpHeader();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHttpPostRule());
            	    					}
            	    					add(
            	    						current,
            	    						"headers",
            	    						lv_headers_5_0,
            	    						"io.beethoven.partitur.Partitur.HttpHeader");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalPartitur.g:767:3: ( (lv_body_6_0= ruleHttpBody ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPartitur.g:768:4: (lv_body_6_0= ruleHttpBody )
                    {
                    // InternalPartitur.g:768:4: (lv_body_6_0= ruleHttpBody )
                    // InternalPartitur.g:769:5: lv_body_6_0= ruleHttpBody
                    {

                    					newCompositeNode(grammarAccess.getHttpPostAccess().getBodyHttpBodyParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleHttpBody();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHttpPostRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_6_0,
                    						"io.beethoven.partitur.Partitur.HttpBody");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpPost"


    // $ANTLR start "entryRuleHttpPut"
    // InternalPartitur.g:790:1: entryRuleHttpPut returns [EObject current=null] : iv_ruleHttpPut= ruleHttpPut EOF ;
    public final EObject entryRuleHttpPut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpPut = null;


        try {
            // InternalPartitur.g:790:48: (iv_ruleHttpPut= ruleHttpPut EOF )
            // InternalPartitur.g:791:2: iv_ruleHttpPut= ruleHttpPut EOF
            {
             newCompositeNode(grammarAccess.getHttpPutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpPut=ruleHttpPut();

            state._fsp--;

             current =iv_ruleHttpPut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpPut"


    // $ANTLR start "ruleHttpPut"
    // InternalPartitur.g:797:1: ruleHttpPut returns [EObject current=null] : (otherlv_0= 'put' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? ) ;
    public final EObject ruleHttpPut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        EObject lv_uriVariables_4_0 = null;

        EObject lv_headers_5_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:803:2: ( (otherlv_0= 'put' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? ) )
            // InternalPartitur.g:804:2: (otherlv_0= 'put' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? )
            {
            // InternalPartitur.g:804:2: (otherlv_0= 'put' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )? )
            // InternalPartitur.g:805:3: otherlv_0= 'put' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ( (lv_body_6_0= ruleHttpBody ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getHttpPutAccess().getPutKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHttpPutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPartitur.g:813:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalPartitur.g:814:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalPartitur.g:814:4: (lv_url_2_0= RULE_STRING )
            // InternalPartitur.g:815:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_url_2_0, grammarAccess.getHttpPutAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpPutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getHttpPutAccess().getRightParenthesisKeyword_3());
            		
            // InternalPartitur.g:835:3: ( (lv_uriVariables_4_0= ruleUriVariables ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPartitur.g:836:4: (lv_uriVariables_4_0= ruleUriVariables )
                    {
                    // InternalPartitur.g:836:4: (lv_uriVariables_4_0= ruleUriVariables )
                    // InternalPartitur.g:837:5: lv_uriVariables_4_0= ruleUriVariables
                    {

                    					newCompositeNode(grammarAccess.getHttpPutAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_uriVariables_4_0=ruleUriVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHttpPutRule());
                    					}
                    					set(
                    						current,
                    						"uriVariables",
                    						lv_uriVariables_4_0,
                    						"io.beethoven.partitur.Partitur.UriVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPartitur.g:854:3: ( (lv_headers_5_0= ruleHttpHeader ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPartitur.g:855:4: (lv_headers_5_0= ruleHttpHeader )
            	    {
            	    // InternalPartitur.g:855:4: (lv_headers_5_0= ruleHttpHeader )
            	    // InternalPartitur.g:856:5: lv_headers_5_0= ruleHttpHeader
            	    {

            	    					newCompositeNode(grammarAccess.getHttpPutAccess().getHeadersHttpHeaderParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_headers_5_0=ruleHttpHeader();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHttpPutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"headers",
            	    						lv_headers_5_0,
            	    						"io.beethoven.partitur.Partitur.HttpHeader");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalPartitur.g:873:3: ( (lv_body_6_0= ruleHttpBody ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPartitur.g:874:4: (lv_body_6_0= ruleHttpBody )
                    {
                    // InternalPartitur.g:874:4: (lv_body_6_0= ruleHttpBody )
                    // InternalPartitur.g:875:5: lv_body_6_0= ruleHttpBody
                    {

                    					newCompositeNode(grammarAccess.getHttpPutAccess().getBodyHttpBodyParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleHttpBody();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHttpPutRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_6_0,
                    						"io.beethoven.partitur.Partitur.HttpBody");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpPut"


    // $ANTLR start "entryRuleHttpDelete"
    // InternalPartitur.g:896:1: entryRuleHttpDelete returns [EObject current=null] : iv_ruleHttpDelete= ruleHttpDelete EOF ;
    public final EObject entryRuleHttpDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpDelete = null;


        try {
            // InternalPartitur.g:896:51: (iv_ruleHttpDelete= ruleHttpDelete EOF )
            // InternalPartitur.g:897:2: iv_ruleHttpDelete= ruleHttpDelete EOF
            {
             newCompositeNode(grammarAccess.getHttpDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpDelete=ruleHttpDelete();

            state._fsp--;

             current =iv_ruleHttpDelete; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpDelete"


    // $ANTLR start "ruleHttpDelete"
    // InternalPartitur.g:903:1: ruleHttpDelete returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ) ;
    public final EObject ruleHttpDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        EObject lv_uriVariables_4_0 = null;

        EObject lv_headers_5_0 = null;



        	enterRule();

        try {
            // InternalPartitur.g:909:2: ( (otherlv_0= 'delete' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* ) )
            // InternalPartitur.g:910:2: (otherlv_0= 'delete' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* )
            {
            // InternalPartitur.g:910:2: (otherlv_0= 'delete' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )* )
            // InternalPartitur.g:911:3: otherlv_0= 'delete' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_uriVariables_4_0= ruleUriVariables ) )? ( (lv_headers_5_0= ruleHttpHeader ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHttpDeleteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPartitur.g:919:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalPartitur.g:920:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalPartitur.g:920:4: (lv_url_2_0= RULE_STRING )
            // InternalPartitur.g:921:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_url_2_0, grammarAccess.getHttpDeleteAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpDeleteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getHttpDeleteAccess().getRightParenthesisKeyword_3());
            		
            // InternalPartitur.g:941:3: ( (lv_uriVariables_4_0= ruleUriVariables ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPartitur.g:942:4: (lv_uriVariables_4_0= ruleUriVariables )
                    {
                    // InternalPartitur.g:942:4: (lv_uriVariables_4_0= ruleUriVariables )
                    // InternalPartitur.g:943:5: lv_uriVariables_4_0= ruleUriVariables
                    {

                    					newCompositeNode(grammarAccess.getHttpDeleteAccess().getUriVariablesUriVariablesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_uriVariables_4_0=ruleUriVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHttpDeleteRule());
                    					}
                    					set(
                    						current,
                    						"uriVariables",
                    						lv_uriVariables_4_0,
                    						"io.beethoven.partitur.Partitur.UriVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPartitur.g:960:3: ( (lv_headers_5_0= ruleHttpHeader ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPartitur.g:961:4: (lv_headers_5_0= ruleHttpHeader )
            	    {
            	    // InternalPartitur.g:961:4: (lv_headers_5_0= ruleHttpHeader )
            	    // InternalPartitur.g:962:5: lv_headers_5_0= ruleHttpHeader
            	    {

            	    					newCompositeNode(grammarAccess.getHttpDeleteAccess().getHeadersHttpHeaderParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_headers_5_0=ruleHttpHeader();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHttpDeleteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"headers",
            	    						lv_headers_5_0,
            	    						"io.beethoven.partitur.Partitur.HttpHeader");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpDelete"


    // $ANTLR start "entryRuleHttpHeader"
    // InternalPartitur.g:983:1: entryRuleHttpHeader returns [EObject current=null] : iv_ruleHttpHeader= ruleHttpHeader EOF ;
    public final EObject entryRuleHttpHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpHeader = null;


        try {
            // InternalPartitur.g:983:51: (iv_ruleHttpHeader= ruleHttpHeader EOF )
            // InternalPartitur.g:984:2: iv_ruleHttpHeader= ruleHttpHeader EOF
            {
             newCompositeNode(grammarAccess.getHttpHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpHeader=ruleHttpHeader();

            state._fsp--;

             current =iv_ruleHttpHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpHeader"


    // $ANTLR start "ruleHttpHeader"
    // InternalPartitur.g:990:1: ruleHttpHeader returns [EObject current=null] : (otherlv_0= '.header(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleHttpHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPartitur.g:996:2: ( (otherlv_0= '.header(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalPartitur.g:997:2: (otherlv_0= '.header(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalPartitur.g:997:2: (otherlv_0= '.header(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalPartitur.g:998:3: otherlv_0= '.header(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getHttpHeaderAccess().getHeaderKeyword_0());
            		
            // InternalPartitur.g:1002:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPartitur.g:1003:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPartitur.g:1003:4: (lv_name_1_0= RULE_STRING )
            // InternalPartitur.g:1004:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHttpHeaderAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getHttpHeaderAccess().getCommaKeyword_2());
            		
            // InternalPartitur.g:1024:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalPartitur.g:1025:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalPartitur.g:1025:4: (lv_value_3_0= RULE_STRING )
            // InternalPartitur.g:1026:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_value_3_0, grammarAccess.getHttpHeaderAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHttpHeaderAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpHeader"


    // $ANTLR start "entryRuleUriVariables"
    // InternalPartitur.g:1050:1: entryRuleUriVariables returns [EObject current=null] : iv_ruleUriVariables= ruleUriVariables EOF ;
    public final EObject entryRuleUriVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUriVariables = null;


        try {
            // InternalPartitur.g:1050:53: (iv_ruleUriVariables= ruleUriVariables EOF )
            // InternalPartitur.g:1051:2: iv_ruleUriVariables= ruleUriVariables EOF
            {
             newCompositeNode(grammarAccess.getUriVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUriVariables=ruleUriVariables();

            state._fsp--;

             current =iv_ruleUriVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUriVariables"


    // $ANTLR start "ruleUriVariables"
    // InternalPartitur.g:1057:1: ruleUriVariables returns [EObject current=null] : (otherlv_0= '.uriVariables(' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleUriVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPartitur.g:1063:2: ( (otherlv_0= '.uriVariables(' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ')' ) )
            // InternalPartitur.g:1064:2: (otherlv_0= '.uriVariables(' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ')' )
            {
            // InternalPartitur.g:1064:2: (otherlv_0= '.uriVariables(' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ')' )
            // InternalPartitur.g:1065:3: otherlv_0= '.uriVariables(' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getUriVariablesAccess().getUriVariablesKeyword_0());
            		
            // InternalPartitur.g:1069:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalPartitur.g:1070:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalPartitur.g:1070:4: (lv_values_1_0= RULE_STRING )
            // InternalPartitur.g:1071:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_values_1_0, grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUriVariablesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPartitur.g:1087:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPartitur.g:1088:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUriVariablesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPartitur.g:1092:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalPartitur.g:1093:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalPartitur.g:1093:5: (lv_values_3_0= RULE_STRING )
            	    // InternalPartitur.g:1094:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUriVariablesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUriVariablesAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUriVariables"


    // $ANTLR start "entryRuleQueryParam"
    // InternalPartitur.g:1119:1: entryRuleQueryParam returns [EObject current=null] : iv_ruleQueryParam= ruleQueryParam EOF ;
    public final EObject entryRuleQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParam = null;


        try {
            // InternalPartitur.g:1119:51: (iv_ruleQueryParam= ruleQueryParam EOF )
            // InternalPartitur.g:1120:2: iv_ruleQueryParam= ruleQueryParam EOF
            {
             newCompositeNode(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryParam=ruleQueryParam();

            state._fsp--;

             current =iv_ruleQueryParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalPartitur.g:1126:1: ruleQueryParam returns [EObject current=null] : (otherlv_0= '.queryParams(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPartitur.g:1132:2: ( (otherlv_0= '.queryParams(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalPartitur.g:1133:2: (otherlv_0= '.queryParams(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalPartitur.g:1133:2: (otherlv_0= '.queryParams(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalPartitur.g:1134:3: otherlv_0= '.queryParams(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryParamAccess().getQueryParamsKeyword_0());
            		
            // InternalPartitur.g:1138:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPartitur.g:1139:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPartitur.g:1139:4: (lv_name_1_0= RULE_STRING )
            // InternalPartitur.g:1140:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQueryParamAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryParamAccess().getCommaKeyword_2());
            		
            // InternalPartitur.g:1160:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalPartitur.g:1161:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalPartitur.g:1161:4: (lv_value_3_0= RULE_STRING )
            // InternalPartitur.g:1162:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_value_3_0, grammarAccess.getQueryParamAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getQueryParamAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRuleHttpBody"
    // InternalPartitur.g:1186:1: entryRuleHttpBody returns [EObject current=null] : iv_ruleHttpBody= ruleHttpBody EOF ;
    public final EObject entryRuleHttpBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpBody = null;


        try {
            // InternalPartitur.g:1186:49: (iv_ruleHttpBody= ruleHttpBody EOF )
            // InternalPartitur.g:1187:2: iv_ruleHttpBody= ruleHttpBody EOF
            {
             newCompositeNode(grammarAccess.getHttpBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpBody=ruleHttpBody();

            state._fsp--;

             current =iv_ruleHttpBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpBody"


    // $ANTLR start "ruleHttpBody"
    // InternalPartitur.g:1193:1: ruleHttpBody returns [EObject current=null] : (otherlv_0= '.body(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleHttpBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPartitur.g:1199:2: ( (otherlv_0= '.body(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalPartitur.g:1200:2: (otherlv_0= '.body(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalPartitur.g:1200:2: (otherlv_0= '.body(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalPartitur.g:1201:3: otherlv_0= '.body(' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getHttpBodyAccess().getBodyKeyword_0());
            		
            // InternalPartitur.g:1205:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalPartitur.g:1206:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalPartitur.g:1206:4: (lv_value_1_0= RULE_STRING )
            // InternalPartitur.g:1207:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_value_1_0, grammarAccess.getHttpBodyAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHttpBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getHttpBodyAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpBody"


    // $ANTLR start "rulePartiturConditionFunction"
    // InternalPartitur.g:1231:1: rulePartiturConditionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'taskNameEqualsTo' ) | (enumLiteral_1= 'taskResponseEqualsTo' ) | (enumLiteral_2= 'workflowNameEqualsTo' ) ) ;
    public final Enumerator rulePartiturConditionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPartitur.g:1237:2: ( ( (enumLiteral_0= 'taskNameEqualsTo' ) | (enumLiteral_1= 'taskResponseEqualsTo' ) | (enumLiteral_2= 'workflowNameEqualsTo' ) ) )
            // InternalPartitur.g:1238:2: ( (enumLiteral_0= 'taskNameEqualsTo' ) | (enumLiteral_1= 'taskResponseEqualsTo' ) | (enumLiteral_2= 'workflowNameEqualsTo' ) )
            {
            // InternalPartitur.g:1238:2: ( (enumLiteral_0= 'taskNameEqualsTo' ) | (enumLiteral_1= 'taskResponseEqualsTo' ) | (enumLiteral_2= 'workflowNameEqualsTo' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPartitur.g:1239:3: (enumLiteral_0= 'taskNameEqualsTo' )
                    {
                    // InternalPartitur.g:1239:3: (enumLiteral_0= 'taskNameEqualsTo' )
                    // InternalPartitur.g:1240:4: enumLiteral_0= 'taskNameEqualsTo'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPartiturConditionFunctionAccess().getTaskNameEqualsToEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPartiturConditionFunctionAccess().getTaskNameEqualsToEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:1247:3: (enumLiteral_1= 'taskResponseEqualsTo' )
                    {
                    // InternalPartitur.g:1247:3: (enumLiteral_1= 'taskResponseEqualsTo' )
                    // InternalPartitur.g:1248:4: enumLiteral_1= 'taskResponseEqualsTo'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPartiturConditionFunctionAccess().getTaskResponseEqualsToEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPartiturConditionFunctionAccess().getTaskResponseEqualsToEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:1255:3: (enumLiteral_2= 'workflowNameEqualsTo' )
                    {
                    // InternalPartitur.g:1255:3: (enumLiteral_2= 'workflowNameEqualsTo' )
                    // InternalPartitur.g:1256:4: enumLiteral_2= 'workflowNameEqualsTo'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPartiturConditionFunctionAccess().getWorkflowNameEqualsToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPartiturConditionFunctionAccess().getWorkflowNameEqualsToEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartiturConditionFunction"


    // $ANTLR start "rulePartiturCommandFunction"
    // InternalPartitur.g:1266:1: rulePartiturCommandFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'startTask' ) | (enumLiteral_1= 'startWorkflow' ) | (enumLiteral_2= 'stopWorkflow' ) | (enumLiteral_3= 'cancelWorkflow' ) ) ;
    public final Enumerator rulePartiturCommandFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPartitur.g:1272:2: ( ( (enumLiteral_0= 'startTask' ) | (enumLiteral_1= 'startWorkflow' ) | (enumLiteral_2= 'stopWorkflow' ) | (enumLiteral_3= 'cancelWorkflow' ) ) )
            // InternalPartitur.g:1273:2: ( (enumLiteral_0= 'startTask' ) | (enumLiteral_1= 'startWorkflow' ) | (enumLiteral_2= 'stopWorkflow' ) | (enumLiteral_3= 'cancelWorkflow' ) )
            {
            // InternalPartitur.g:1273:2: ( (enumLiteral_0= 'startTask' ) | (enumLiteral_1= 'startWorkflow' ) | (enumLiteral_2= 'stopWorkflow' ) | (enumLiteral_3= 'cancelWorkflow' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPartitur.g:1274:3: (enumLiteral_0= 'startTask' )
                    {
                    // InternalPartitur.g:1274:3: (enumLiteral_0= 'startTask' )
                    // InternalPartitur.g:1275:4: enumLiteral_0= 'startTask'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPartiturCommandFunctionAccess().getStartTaskEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPartiturCommandFunctionAccess().getStartTaskEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:1282:3: (enumLiteral_1= 'startWorkflow' )
                    {
                    // InternalPartitur.g:1282:3: (enumLiteral_1= 'startWorkflow' )
                    // InternalPartitur.g:1283:4: enumLiteral_1= 'startWorkflow'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPartiturCommandFunctionAccess().getStartWorkflowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPartiturCommandFunctionAccess().getStartWorkflowEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:1290:3: (enumLiteral_2= 'stopWorkflow' )
                    {
                    // InternalPartitur.g:1290:3: (enumLiteral_2= 'stopWorkflow' )
                    // InternalPartitur.g:1291:4: enumLiteral_2= 'stopWorkflow'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPartiturCommandFunctionAccess().getStopWorkflowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPartiturCommandFunctionAccess().getStopWorkflowEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPartitur.g:1298:3: (enumLiteral_3= 'cancelWorkflow' )
                    {
                    // InternalPartitur.g:1298:3: (enumLiteral_3= 'cancelWorkflow' )
                    // InternalPartitur.g:1299:4: enumLiteral_3= 'cancelWorkflow'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPartiturCommandFunctionAccess().getCancelWorkflowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPartiturCommandFunctionAccess().getCancelWorkflowEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartiturCommandFunction"


    // $ANTLR start "ruleEventType"
    // InternalPartitur.g:1309:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'TASK_STARTED' ) | (enumLiteral_1= 'TASK_COMPLETED' ) | (enumLiteral_2= 'TASK_TIMEDOUT' ) | (enumLiteral_3= 'TASK_FAILED' ) | (enumLiteral_4= 'WORKFLOW_SCHEDULED' ) | (enumLiteral_5= 'WORKFLOW_STARTED' ) | (enumLiteral_6= 'WORKFLOW_COMPLETED' ) ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalPartitur.g:1315:2: ( ( (enumLiteral_0= 'TASK_STARTED' ) | (enumLiteral_1= 'TASK_COMPLETED' ) | (enumLiteral_2= 'TASK_TIMEDOUT' ) | (enumLiteral_3= 'TASK_FAILED' ) | (enumLiteral_4= 'WORKFLOW_SCHEDULED' ) | (enumLiteral_5= 'WORKFLOW_STARTED' ) | (enumLiteral_6= 'WORKFLOW_COMPLETED' ) ) )
            // InternalPartitur.g:1316:2: ( (enumLiteral_0= 'TASK_STARTED' ) | (enumLiteral_1= 'TASK_COMPLETED' ) | (enumLiteral_2= 'TASK_TIMEDOUT' ) | (enumLiteral_3= 'TASK_FAILED' ) | (enumLiteral_4= 'WORKFLOW_SCHEDULED' ) | (enumLiteral_5= 'WORKFLOW_STARTED' ) | (enumLiteral_6= 'WORKFLOW_COMPLETED' ) )
            {
            // InternalPartitur.g:1316:2: ( (enumLiteral_0= 'TASK_STARTED' ) | (enumLiteral_1= 'TASK_COMPLETED' ) | (enumLiteral_2= 'TASK_TIMEDOUT' ) | (enumLiteral_3= 'TASK_FAILED' ) | (enumLiteral_4= 'WORKFLOW_SCHEDULED' ) | (enumLiteral_5= 'WORKFLOW_STARTED' ) | (enumLiteral_6= 'WORKFLOW_COMPLETED' ) )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case 39:
                {
                alt20=3;
                }
                break;
            case 40:
                {
                alt20=4;
                }
                break;
            case 41:
                {
                alt20=5;
                }
                break;
            case 42:
                {
                alt20=6;
                }
                break;
            case 43:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPartitur.g:1317:3: (enumLiteral_0= 'TASK_STARTED' )
                    {
                    // InternalPartitur.g:1317:3: (enumLiteral_0= 'TASK_STARTED' )
                    // InternalPartitur.g:1318:4: enumLiteral_0= 'TASK_STARTED'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTASK_STARTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getTASK_STARTEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:1325:3: (enumLiteral_1= 'TASK_COMPLETED' )
                    {
                    // InternalPartitur.g:1325:3: (enumLiteral_1= 'TASK_COMPLETED' )
                    // InternalPartitur.g:1326:4: enumLiteral_1= 'TASK_COMPLETED'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTASK_COMPLETEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getTASK_COMPLETEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:1333:3: (enumLiteral_2= 'TASK_TIMEDOUT' )
                    {
                    // InternalPartitur.g:1333:3: (enumLiteral_2= 'TASK_TIMEDOUT' )
                    // InternalPartitur.g:1334:4: enumLiteral_2= 'TASK_TIMEDOUT'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTASK_TIMEDOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getTASK_TIMEDOUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPartitur.g:1341:3: (enumLiteral_3= 'TASK_FAILED' )
                    {
                    // InternalPartitur.g:1341:3: (enumLiteral_3= 'TASK_FAILED' )
                    // InternalPartitur.g:1342:4: enumLiteral_3= 'TASK_FAILED'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTASK_FAILEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getTASK_FAILEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPartitur.g:1349:3: (enumLiteral_4= 'WORKFLOW_SCHEDULED' )
                    {
                    // InternalPartitur.g:1349:3: (enumLiteral_4= 'WORKFLOW_SCHEDULED' )
                    // InternalPartitur.g:1350:4: enumLiteral_4= 'WORKFLOW_SCHEDULED'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getWORKFLOW_SCHEDULEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getWORKFLOW_SCHEDULEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPartitur.g:1357:3: (enumLiteral_5= 'WORKFLOW_STARTED' )
                    {
                    // InternalPartitur.g:1357:3: (enumLiteral_5= 'WORKFLOW_STARTED' )
                    // InternalPartitur.g:1358:4: enumLiteral_5= 'WORKFLOW_STARTED'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getWORKFLOW_STARTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEventTypeAccess().getWORKFLOW_STARTEDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPartitur.g:1365:3: (enumLiteral_6= 'WORKFLOW_COMPLETED' )
                    {
                    // InternalPartitur.g:1365:3: (enumLiteral_6= 'WORKFLOW_COMPLETED' )
                    // InternalPartitur.g:1366:4: enumLiteral_6= 'WORKFLOW_COMPLETED'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getWORKFLOW_COMPLETEDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEventTypeAccess().getWORKFLOW_COMPLETEDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000FE000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000002C000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000240000L});

}