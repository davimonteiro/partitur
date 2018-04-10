package io.beethoven.partitur.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import io.beethoven.partitur.services.PartiturGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPartiturParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'taskNameEqualsTo'", "'taskResponseEqualsTo'", "'workflowNameEqualsTo'", "'startTask'", "'startWorkflow'", "'stopWorkflow'", "'cancelWorkflow'", "'TASK_STARTED'", "'TASK_COMPLETED'", "'TASK_TIMEDOUT'", "'TASK_FAILED'", "'WORKFLOW_SCHEDULED'", "'WORKFLOW_STARTED'", "'WORKFLOW_COMPLETED'", "'workflow'", "'{'", "'}'", "'task'", "'handler'", "'on'", "'when'", "'then'", "','", "'('", "')'", "'get'", "'post'", "'put'", "'delete'", "'.header('", "'.uriVariables('", "'.queryParams('", "'.body('"
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

    	public void setGrammarAccess(PartiturGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePartiturWorkflow"
    // InternalPartitur.g:53:1: entryRulePartiturWorkflow : rulePartiturWorkflow EOF ;
    public final void entryRulePartiturWorkflow() throws RecognitionException {
        try {
            // InternalPartitur.g:54:1: ( rulePartiturWorkflow EOF )
            // InternalPartitur.g:55:1: rulePartiturWorkflow EOF
            {
             before(grammarAccess.getPartiturWorkflowRule()); 
            pushFollow(FOLLOW_1);
            rulePartiturWorkflow();

            state._fsp--;

             after(grammarAccess.getPartiturWorkflowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartiturWorkflow"


    // $ANTLR start "rulePartiturWorkflow"
    // InternalPartitur.g:62:1: rulePartiturWorkflow : ( ( rule__PartiturWorkflow__Group__0 ) ) ;
    public final void rulePartiturWorkflow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:66:2: ( ( ( rule__PartiturWorkflow__Group__0 ) ) )
            // InternalPartitur.g:67:2: ( ( rule__PartiturWorkflow__Group__0 ) )
            {
            // InternalPartitur.g:67:2: ( ( rule__PartiturWorkflow__Group__0 ) )
            // InternalPartitur.g:68:3: ( rule__PartiturWorkflow__Group__0 )
            {
             before(grammarAccess.getPartiturWorkflowAccess().getGroup()); 
            // InternalPartitur.g:69:3: ( rule__PartiturWorkflow__Group__0 )
            // InternalPartitur.g:69:4: rule__PartiturWorkflow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartiturWorkflowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartiturWorkflow"


    // $ANTLR start "entryRulePartiturTask"
    // InternalPartitur.g:78:1: entryRulePartiturTask : rulePartiturTask EOF ;
    public final void entryRulePartiturTask() throws RecognitionException {
        try {
            // InternalPartitur.g:79:1: ( rulePartiturTask EOF )
            // InternalPartitur.g:80:1: rulePartiturTask EOF
            {
             before(grammarAccess.getPartiturTaskRule()); 
            pushFollow(FOLLOW_1);
            rulePartiturTask();

            state._fsp--;

             after(grammarAccess.getPartiturTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartiturTask"


    // $ANTLR start "rulePartiturTask"
    // InternalPartitur.g:87:1: rulePartiturTask : ( ( rule__PartiturTask__Group__0 ) ) ;
    public final void rulePartiturTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:91:2: ( ( ( rule__PartiturTask__Group__0 ) ) )
            // InternalPartitur.g:92:2: ( ( rule__PartiturTask__Group__0 ) )
            {
            // InternalPartitur.g:92:2: ( ( rule__PartiturTask__Group__0 ) )
            // InternalPartitur.g:93:3: ( rule__PartiturTask__Group__0 )
            {
             before(grammarAccess.getPartiturTaskAccess().getGroup()); 
            // InternalPartitur.g:94:3: ( rule__PartiturTask__Group__0 )
            // InternalPartitur.g:94:4: rule__PartiturTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartiturTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartiturTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartiturTask"


    // $ANTLR start "entryRulePartiturHandler"
    // InternalPartitur.g:103:1: entryRulePartiturHandler : rulePartiturHandler EOF ;
    public final void entryRulePartiturHandler() throws RecognitionException {
        try {
            // InternalPartitur.g:104:1: ( rulePartiturHandler EOF )
            // InternalPartitur.g:105:1: rulePartiturHandler EOF
            {
             before(grammarAccess.getPartiturHandlerRule()); 
            pushFollow(FOLLOW_1);
            rulePartiturHandler();

            state._fsp--;

             after(grammarAccess.getPartiturHandlerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartiturHandler"


    // $ANTLR start "rulePartiturHandler"
    // InternalPartitur.g:112:1: rulePartiturHandler : ( ( rule__PartiturHandler__Group__0 ) ) ;
    public final void rulePartiturHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:116:2: ( ( ( rule__PartiturHandler__Group__0 ) ) )
            // InternalPartitur.g:117:2: ( ( rule__PartiturHandler__Group__0 ) )
            {
            // InternalPartitur.g:117:2: ( ( rule__PartiturHandler__Group__0 ) )
            // InternalPartitur.g:118:3: ( rule__PartiturHandler__Group__0 )
            {
             before(grammarAccess.getPartiturHandlerAccess().getGroup()); 
            // InternalPartitur.g:119:3: ( rule__PartiturHandler__Group__0 )
            // InternalPartitur.g:119:4: rule__PartiturHandler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartiturHandlerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartiturHandler"


    // $ANTLR start "entryRulePartiturCondition"
    // InternalPartitur.g:128:1: entryRulePartiturCondition : rulePartiturCondition EOF ;
    public final void entryRulePartiturCondition() throws RecognitionException {
        try {
            // InternalPartitur.g:129:1: ( rulePartiturCondition EOF )
            // InternalPartitur.g:130:1: rulePartiturCondition EOF
            {
             before(grammarAccess.getPartiturConditionRule()); 
            pushFollow(FOLLOW_1);
            rulePartiturCondition();

            state._fsp--;

             after(grammarAccess.getPartiturConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartiturCondition"


    // $ANTLR start "rulePartiturCondition"
    // InternalPartitur.g:137:1: rulePartiturCondition : ( ( rule__PartiturCondition__Group__0 ) ) ;
    public final void rulePartiturCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:141:2: ( ( ( rule__PartiturCondition__Group__0 ) ) )
            // InternalPartitur.g:142:2: ( ( rule__PartiturCondition__Group__0 ) )
            {
            // InternalPartitur.g:142:2: ( ( rule__PartiturCondition__Group__0 ) )
            // InternalPartitur.g:143:3: ( rule__PartiturCondition__Group__0 )
            {
             before(grammarAccess.getPartiturConditionAccess().getGroup()); 
            // InternalPartitur.g:144:3: ( rule__PartiturCondition__Group__0 )
            // InternalPartitur.g:144:4: rule__PartiturCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartiturConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartiturCondition"


    // $ANTLR start "entryRulePartiturCommand"
    // InternalPartitur.g:153:1: entryRulePartiturCommand : rulePartiturCommand EOF ;
    public final void entryRulePartiturCommand() throws RecognitionException {
        try {
            // InternalPartitur.g:154:1: ( rulePartiturCommand EOF )
            // InternalPartitur.g:155:1: rulePartiturCommand EOF
            {
             before(grammarAccess.getPartiturCommandRule()); 
            pushFollow(FOLLOW_1);
            rulePartiturCommand();

            state._fsp--;

             after(grammarAccess.getPartiturCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartiturCommand"


    // $ANTLR start "rulePartiturCommand"
    // InternalPartitur.g:162:1: rulePartiturCommand : ( ( rule__PartiturCommand__Group__0 ) ) ;
    public final void rulePartiturCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:166:2: ( ( ( rule__PartiturCommand__Group__0 ) ) )
            // InternalPartitur.g:167:2: ( ( rule__PartiturCommand__Group__0 ) )
            {
            // InternalPartitur.g:167:2: ( ( rule__PartiturCommand__Group__0 ) )
            // InternalPartitur.g:168:3: ( rule__PartiturCommand__Group__0 )
            {
             before(grammarAccess.getPartiturCommandAccess().getGroup()); 
            // InternalPartitur.g:169:3: ( rule__PartiturCommand__Group__0 )
            // InternalPartitur.g:169:4: rule__PartiturCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartiturCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartiturCommand"


    // $ANTLR start "entryRuleHttpGet"
    // InternalPartitur.g:178:1: entryRuleHttpGet : ruleHttpGet EOF ;
    public final void entryRuleHttpGet() throws RecognitionException {
        try {
            // InternalPartitur.g:179:1: ( ruleHttpGet EOF )
            // InternalPartitur.g:180:1: ruleHttpGet EOF
            {
             before(grammarAccess.getHttpGetRule()); 
            pushFollow(FOLLOW_1);
            ruleHttpGet();

            state._fsp--;

             after(grammarAccess.getHttpGetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpGet"


    // $ANTLR start "ruleHttpGet"
    // InternalPartitur.g:187:1: ruleHttpGet : ( ( rule__HttpGet__Group__0 ) ) ;
    public final void ruleHttpGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:191:2: ( ( ( rule__HttpGet__Group__0 ) ) )
            // InternalPartitur.g:192:2: ( ( rule__HttpGet__Group__0 ) )
            {
            // InternalPartitur.g:192:2: ( ( rule__HttpGet__Group__0 ) )
            // InternalPartitur.g:193:3: ( rule__HttpGet__Group__0 )
            {
             before(grammarAccess.getHttpGetAccess().getGroup()); 
            // InternalPartitur.g:194:3: ( rule__HttpGet__Group__0 )
            // InternalPartitur.g:194:4: rule__HttpGet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpGetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpGet"


    // $ANTLR start "entryRuleHttpPost"
    // InternalPartitur.g:203:1: entryRuleHttpPost : ruleHttpPost EOF ;
    public final void entryRuleHttpPost() throws RecognitionException {
        try {
            // InternalPartitur.g:204:1: ( ruleHttpPost EOF )
            // InternalPartitur.g:205:1: ruleHttpPost EOF
            {
             before(grammarAccess.getHttpPostRule()); 
            pushFollow(FOLLOW_1);
            ruleHttpPost();

            state._fsp--;

             after(grammarAccess.getHttpPostRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpPost"


    // $ANTLR start "ruleHttpPost"
    // InternalPartitur.g:212:1: ruleHttpPost : ( ( rule__HttpPost__Group__0 ) ) ;
    public final void ruleHttpPost() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:216:2: ( ( ( rule__HttpPost__Group__0 ) ) )
            // InternalPartitur.g:217:2: ( ( rule__HttpPost__Group__0 ) )
            {
            // InternalPartitur.g:217:2: ( ( rule__HttpPost__Group__0 ) )
            // InternalPartitur.g:218:3: ( rule__HttpPost__Group__0 )
            {
             before(grammarAccess.getHttpPostAccess().getGroup()); 
            // InternalPartitur.g:219:3: ( rule__HttpPost__Group__0 )
            // InternalPartitur.g:219:4: rule__HttpPost__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpPostAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpPost"


    // $ANTLR start "entryRuleHttpPut"
    // InternalPartitur.g:228:1: entryRuleHttpPut : ruleHttpPut EOF ;
    public final void entryRuleHttpPut() throws RecognitionException {
        try {
            // InternalPartitur.g:229:1: ( ruleHttpPut EOF )
            // InternalPartitur.g:230:1: ruleHttpPut EOF
            {
             before(grammarAccess.getHttpPutRule()); 
            pushFollow(FOLLOW_1);
            ruleHttpPut();

            state._fsp--;

             after(grammarAccess.getHttpPutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpPut"


    // $ANTLR start "ruleHttpPut"
    // InternalPartitur.g:237:1: ruleHttpPut : ( ( rule__HttpPut__Group__0 ) ) ;
    public final void ruleHttpPut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:241:2: ( ( ( rule__HttpPut__Group__0 ) ) )
            // InternalPartitur.g:242:2: ( ( rule__HttpPut__Group__0 ) )
            {
            // InternalPartitur.g:242:2: ( ( rule__HttpPut__Group__0 ) )
            // InternalPartitur.g:243:3: ( rule__HttpPut__Group__0 )
            {
             before(grammarAccess.getHttpPutAccess().getGroup()); 
            // InternalPartitur.g:244:3: ( rule__HttpPut__Group__0 )
            // InternalPartitur.g:244:4: rule__HttpPut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpPutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpPut"


    // $ANTLR start "entryRuleHttpDelete"
    // InternalPartitur.g:253:1: entryRuleHttpDelete : ruleHttpDelete EOF ;
    public final void entryRuleHttpDelete() throws RecognitionException {
        try {
            // InternalPartitur.g:254:1: ( ruleHttpDelete EOF )
            // InternalPartitur.g:255:1: ruleHttpDelete EOF
            {
             before(grammarAccess.getHttpDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleHttpDelete();

            state._fsp--;

             after(grammarAccess.getHttpDeleteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpDelete"


    // $ANTLR start "ruleHttpDelete"
    // InternalPartitur.g:262:1: ruleHttpDelete : ( ( rule__HttpDelete__Group__0 ) ) ;
    public final void ruleHttpDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:266:2: ( ( ( rule__HttpDelete__Group__0 ) ) )
            // InternalPartitur.g:267:2: ( ( rule__HttpDelete__Group__0 ) )
            {
            // InternalPartitur.g:267:2: ( ( rule__HttpDelete__Group__0 ) )
            // InternalPartitur.g:268:3: ( rule__HttpDelete__Group__0 )
            {
             before(grammarAccess.getHttpDeleteAccess().getGroup()); 
            // InternalPartitur.g:269:3: ( rule__HttpDelete__Group__0 )
            // InternalPartitur.g:269:4: rule__HttpDelete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HttpDelete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpDelete"


    // $ANTLR start "entryRuleHttpHeader"
    // InternalPartitur.g:278:1: entryRuleHttpHeader : ruleHttpHeader EOF ;
    public final void entryRuleHttpHeader() throws RecognitionException {
        try {
            // InternalPartitur.g:279:1: ( ruleHttpHeader EOF )
            // InternalPartitur.g:280:1: ruleHttpHeader EOF
            {
             before(grammarAccess.getHttpHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHttpHeader();

            state._fsp--;

             after(grammarAccess.getHttpHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpHeader"


    // $ANTLR start "ruleHttpHeader"
    // InternalPartitur.g:287:1: ruleHttpHeader : ( ( rule__HttpHeader__Group__0 ) ) ;
    public final void ruleHttpHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:291:2: ( ( ( rule__HttpHeader__Group__0 ) ) )
            // InternalPartitur.g:292:2: ( ( rule__HttpHeader__Group__0 ) )
            {
            // InternalPartitur.g:292:2: ( ( rule__HttpHeader__Group__0 ) )
            // InternalPartitur.g:293:3: ( rule__HttpHeader__Group__0 )
            {
             before(grammarAccess.getHttpHeaderAccess().getGroup()); 
            // InternalPartitur.g:294:3: ( rule__HttpHeader__Group__0 )
            // InternalPartitur.g:294:4: rule__HttpHeader__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpHeader"


    // $ANTLR start "entryRuleUriVariables"
    // InternalPartitur.g:303:1: entryRuleUriVariables : ruleUriVariables EOF ;
    public final void entryRuleUriVariables() throws RecognitionException {
        try {
            // InternalPartitur.g:304:1: ( ruleUriVariables EOF )
            // InternalPartitur.g:305:1: ruleUriVariables EOF
            {
             before(grammarAccess.getUriVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleUriVariables();

            state._fsp--;

             after(grammarAccess.getUriVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUriVariables"


    // $ANTLR start "ruleUriVariables"
    // InternalPartitur.g:312:1: ruleUriVariables : ( ( rule__UriVariables__Group__0 ) ) ;
    public final void ruleUriVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:316:2: ( ( ( rule__UriVariables__Group__0 ) ) )
            // InternalPartitur.g:317:2: ( ( rule__UriVariables__Group__0 ) )
            {
            // InternalPartitur.g:317:2: ( ( rule__UriVariables__Group__0 ) )
            // InternalPartitur.g:318:3: ( rule__UriVariables__Group__0 )
            {
             before(grammarAccess.getUriVariablesAccess().getGroup()); 
            // InternalPartitur.g:319:3: ( rule__UriVariables__Group__0 )
            // InternalPartitur.g:319:4: rule__UriVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UriVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUriVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUriVariables"


    // $ANTLR start "entryRuleQueryParam"
    // InternalPartitur.g:328:1: entryRuleQueryParam : ruleQueryParam EOF ;
    public final void entryRuleQueryParam() throws RecognitionException {
        try {
            // InternalPartitur.g:329:1: ( ruleQueryParam EOF )
            // InternalPartitur.g:330:1: ruleQueryParam EOF
            {
             before(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getQueryParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalPartitur.g:337:1: ruleQueryParam : ( ( rule__QueryParam__Group__0 ) ) ;
    public final void ruleQueryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:341:2: ( ( ( rule__QueryParam__Group__0 ) ) )
            // InternalPartitur.g:342:2: ( ( rule__QueryParam__Group__0 ) )
            {
            // InternalPartitur.g:342:2: ( ( rule__QueryParam__Group__0 ) )
            // InternalPartitur.g:343:3: ( rule__QueryParam__Group__0 )
            {
             before(grammarAccess.getQueryParamAccess().getGroup()); 
            // InternalPartitur.g:344:3: ( rule__QueryParam__Group__0 )
            // InternalPartitur.g:344:4: rule__QueryParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRuleHttpBody"
    // InternalPartitur.g:353:1: entryRuleHttpBody : ruleHttpBody EOF ;
    public final void entryRuleHttpBody() throws RecognitionException {
        try {
            // InternalPartitur.g:354:1: ( ruleHttpBody EOF )
            // InternalPartitur.g:355:1: ruleHttpBody EOF
            {
             before(grammarAccess.getHttpBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleHttpBody();

            state._fsp--;

             after(grammarAccess.getHttpBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpBody"


    // $ANTLR start "ruleHttpBody"
    // InternalPartitur.g:362:1: ruleHttpBody : ( ( rule__HttpBody__Group__0 ) ) ;
    public final void ruleHttpBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:366:2: ( ( ( rule__HttpBody__Group__0 ) ) )
            // InternalPartitur.g:367:2: ( ( rule__HttpBody__Group__0 ) )
            {
            // InternalPartitur.g:367:2: ( ( rule__HttpBody__Group__0 ) )
            // InternalPartitur.g:368:3: ( rule__HttpBody__Group__0 )
            {
             before(grammarAccess.getHttpBodyAccess().getGroup()); 
            // InternalPartitur.g:369:3: ( rule__HttpBody__Group__0 )
            // InternalPartitur.g:369:4: rule__HttpBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HttpBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpBody"


    // $ANTLR start "rulePartiturConditionFunction"
    // InternalPartitur.g:378:1: rulePartiturConditionFunction : ( ( rule__PartiturConditionFunction__Alternatives ) ) ;
    public final void rulePartiturConditionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:382:1: ( ( ( rule__PartiturConditionFunction__Alternatives ) ) )
            // InternalPartitur.g:383:2: ( ( rule__PartiturConditionFunction__Alternatives ) )
            {
            // InternalPartitur.g:383:2: ( ( rule__PartiturConditionFunction__Alternatives ) )
            // InternalPartitur.g:384:3: ( rule__PartiturConditionFunction__Alternatives )
            {
             before(grammarAccess.getPartiturConditionFunctionAccess().getAlternatives()); 
            // InternalPartitur.g:385:3: ( rule__PartiturConditionFunction__Alternatives )
            // InternalPartitur.g:385:4: rule__PartiturConditionFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartiturConditionFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartiturConditionFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartiturConditionFunction"


    // $ANTLR start "rulePartiturCommandFunction"
    // InternalPartitur.g:394:1: rulePartiturCommandFunction : ( ( rule__PartiturCommandFunction__Alternatives ) ) ;
    public final void rulePartiturCommandFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:398:1: ( ( ( rule__PartiturCommandFunction__Alternatives ) ) )
            // InternalPartitur.g:399:2: ( ( rule__PartiturCommandFunction__Alternatives ) )
            {
            // InternalPartitur.g:399:2: ( ( rule__PartiturCommandFunction__Alternatives ) )
            // InternalPartitur.g:400:3: ( rule__PartiturCommandFunction__Alternatives )
            {
             before(grammarAccess.getPartiturCommandFunctionAccess().getAlternatives()); 
            // InternalPartitur.g:401:3: ( rule__PartiturCommandFunction__Alternatives )
            // InternalPartitur.g:401:4: rule__PartiturCommandFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCommandFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartiturCommandFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartiturCommandFunction"


    // $ANTLR start "ruleEventType"
    // InternalPartitur.g:410:1: ruleEventType : ( ( rule__EventType__Alternatives ) ) ;
    public final void ruleEventType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:414:1: ( ( ( rule__EventType__Alternatives ) ) )
            // InternalPartitur.g:415:2: ( ( rule__EventType__Alternatives ) )
            {
            // InternalPartitur.g:415:2: ( ( rule__EventType__Alternatives ) )
            // InternalPartitur.g:416:3: ( rule__EventType__Alternatives )
            {
             before(grammarAccess.getEventTypeAccess().getAlternatives()); 
            // InternalPartitur.g:417:3: ( rule__EventType__Alternatives )
            // InternalPartitur.g:417:4: rule__EventType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventType"


    // $ANTLR start "rule__PartiturTask__Alternatives_3"
    // InternalPartitur.g:425:1: rule__PartiturTask__Alternatives_3 : ( ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_0 ) ) | ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_1 ) ) | ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_2 ) ) | ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_3 ) ) );
    public final void rule__PartiturTask__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:429:1: ( ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_0 ) ) | ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_1 ) ) | ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_2 ) ) | ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            case 39:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPartitur.g:430:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_0 ) )
                    {
                    // InternalPartitur.g:430:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_0 ) )
                    // InternalPartitur.g:431:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_0 )
                    {
                     before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_0()); 
                    // InternalPartitur.g:432:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_0 )
                    // InternalPartitur.g:432:4: rule__PartiturTask__PartiturHttpRequestAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartiturTask__PartiturHttpRequestAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:436:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_1 ) )
                    {
                    // InternalPartitur.g:436:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_1 ) )
                    // InternalPartitur.g:437:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_1 )
                    {
                     before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_1()); 
                    // InternalPartitur.g:438:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_1 )
                    // InternalPartitur.g:438:4: rule__PartiturTask__PartiturHttpRequestAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartiturTask__PartiturHttpRequestAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:442:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_2 ) )
                    {
                    // InternalPartitur.g:442:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_2 ) )
                    // InternalPartitur.g:443:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_2 )
                    {
                     before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_2()); 
                    // InternalPartitur.g:444:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_2 )
                    // InternalPartitur.g:444:4: rule__PartiturTask__PartiturHttpRequestAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartiturTask__PartiturHttpRequestAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPartitur.g:448:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_3 ) )
                    {
                    // InternalPartitur.g:448:2: ( ( rule__PartiturTask__PartiturHttpRequestAssignment_3_3 ) )
                    // InternalPartitur.g:449:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_3 )
                    {
                     before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_3()); 
                    // InternalPartitur.g:450:3: ( rule__PartiturTask__PartiturHttpRequestAssignment_3_3 )
                    // InternalPartitur.g:450:4: rule__PartiturTask__PartiturHttpRequestAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartiturTask__PartiturHttpRequestAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestAssignment_3_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Alternatives_3"


    // $ANTLR start "rule__PartiturConditionFunction__Alternatives"
    // InternalPartitur.g:458:1: rule__PartiturConditionFunction__Alternatives : ( ( ( 'taskNameEqualsTo' ) ) | ( ( 'taskResponseEqualsTo' ) ) | ( ( 'workflowNameEqualsTo' ) ) );
    public final void rule__PartiturConditionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:462:1: ( ( ( 'taskNameEqualsTo' ) ) | ( ( 'taskResponseEqualsTo' ) ) | ( ( 'workflowNameEqualsTo' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPartitur.g:463:2: ( ( 'taskNameEqualsTo' ) )
                    {
                    // InternalPartitur.g:463:2: ( ( 'taskNameEqualsTo' ) )
                    // InternalPartitur.g:464:3: ( 'taskNameEqualsTo' )
                    {
                     before(grammarAccess.getPartiturConditionFunctionAccess().getTaskNameEqualsToEnumLiteralDeclaration_0()); 
                    // InternalPartitur.g:465:3: ( 'taskNameEqualsTo' )
                    // InternalPartitur.g:465:4: 'taskNameEqualsTo'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartiturConditionFunctionAccess().getTaskNameEqualsToEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:469:2: ( ( 'taskResponseEqualsTo' ) )
                    {
                    // InternalPartitur.g:469:2: ( ( 'taskResponseEqualsTo' ) )
                    // InternalPartitur.g:470:3: ( 'taskResponseEqualsTo' )
                    {
                     before(grammarAccess.getPartiturConditionFunctionAccess().getTaskResponseEqualsToEnumLiteralDeclaration_1()); 
                    // InternalPartitur.g:471:3: ( 'taskResponseEqualsTo' )
                    // InternalPartitur.g:471:4: 'taskResponseEqualsTo'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartiturConditionFunctionAccess().getTaskResponseEqualsToEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:475:2: ( ( 'workflowNameEqualsTo' ) )
                    {
                    // InternalPartitur.g:475:2: ( ( 'workflowNameEqualsTo' ) )
                    // InternalPartitur.g:476:3: ( 'workflowNameEqualsTo' )
                    {
                     before(grammarAccess.getPartiturConditionFunctionAccess().getWorkflowNameEqualsToEnumLiteralDeclaration_2()); 
                    // InternalPartitur.g:477:3: ( 'workflowNameEqualsTo' )
                    // InternalPartitur.g:477:4: 'workflowNameEqualsTo'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartiturConditionFunctionAccess().getWorkflowNameEqualsToEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturConditionFunction__Alternatives"


    // $ANTLR start "rule__PartiturCommandFunction__Alternatives"
    // InternalPartitur.g:485:1: rule__PartiturCommandFunction__Alternatives : ( ( ( 'startTask' ) ) | ( ( 'startWorkflow' ) ) | ( ( 'stopWorkflow' ) ) | ( ( 'cancelWorkflow' ) ) );
    public final void rule__PartiturCommandFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:489:1: ( ( ( 'startTask' ) ) | ( ( 'startWorkflow' ) ) | ( ( 'stopWorkflow' ) ) | ( ( 'cancelWorkflow' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
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
                    // InternalPartitur.g:490:2: ( ( 'startTask' ) )
                    {
                    // InternalPartitur.g:490:2: ( ( 'startTask' ) )
                    // InternalPartitur.g:491:3: ( 'startTask' )
                    {
                     before(grammarAccess.getPartiturCommandFunctionAccess().getStartTaskEnumLiteralDeclaration_0()); 
                    // InternalPartitur.g:492:3: ( 'startTask' )
                    // InternalPartitur.g:492:4: 'startTask'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartiturCommandFunctionAccess().getStartTaskEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:496:2: ( ( 'startWorkflow' ) )
                    {
                    // InternalPartitur.g:496:2: ( ( 'startWorkflow' ) )
                    // InternalPartitur.g:497:3: ( 'startWorkflow' )
                    {
                     before(grammarAccess.getPartiturCommandFunctionAccess().getStartWorkflowEnumLiteralDeclaration_1()); 
                    // InternalPartitur.g:498:3: ( 'startWorkflow' )
                    // InternalPartitur.g:498:4: 'startWorkflow'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartiturCommandFunctionAccess().getStartWorkflowEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:502:2: ( ( 'stopWorkflow' ) )
                    {
                    // InternalPartitur.g:502:2: ( ( 'stopWorkflow' ) )
                    // InternalPartitur.g:503:3: ( 'stopWorkflow' )
                    {
                     before(grammarAccess.getPartiturCommandFunctionAccess().getStopWorkflowEnumLiteralDeclaration_2()); 
                    // InternalPartitur.g:504:3: ( 'stopWorkflow' )
                    // InternalPartitur.g:504:4: 'stopWorkflow'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartiturCommandFunctionAccess().getStopWorkflowEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPartitur.g:508:2: ( ( 'cancelWorkflow' ) )
                    {
                    // InternalPartitur.g:508:2: ( ( 'cancelWorkflow' ) )
                    // InternalPartitur.g:509:3: ( 'cancelWorkflow' )
                    {
                     before(grammarAccess.getPartiturCommandFunctionAccess().getCancelWorkflowEnumLiteralDeclaration_3()); 
                    // InternalPartitur.g:510:3: ( 'cancelWorkflow' )
                    // InternalPartitur.g:510:4: 'cancelWorkflow'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPartiturCommandFunctionAccess().getCancelWorkflowEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommandFunction__Alternatives"


    // $ANTLR start "rule__EventType__Alternatives"
    // InternalPartitur.g:518:1: rule__EventType__Alternatives : ( ( ( 'TASK_STARTED' ) ) | ( ( 'TASK_COMPLETED' ) ) | ( ( 'TASK_TIMEDOUT' ) ) | ( ( 'TASK_FAILED' ) ) | ( ( 'WORKFLOW_SCHEDULED' ) ) | ( ( 'WORKFLOW_STARTED' ) ) | ( ( 'WORKFLOW_COMPLETED' ) ) );
    public final void rule__EventType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:522:1: ( ( ( 'TASK_STARTED' ) ) | ( ( 'TASK_COMPLETED' ) ) | ( ( 'TASK_TIMEDOUT' ) ) | ( ( 'TASK_FAILED' ) ) | ( ( 'WORKFLOW_SCHEDULED' ) ) | ( ( 'WORKFLOW_STARTED' ) ) | ( ( 'WORKFLOW_COMPLETED' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPartitur.g:523:2: ( ( 'TASK_STARTED' ) )
                    {
                    // InternalPartitur.g:523:2: ( ( 'TASK_STARTED' ) )
                    // InternalPartitur.g:524:3: ( 'TASK_STARTED' )
                    {
                     before(grammarAccess.getEventTypeAccess().getTASK_STARTEDEnumLiteralDeclaration_0()); 
                    // InternalPartitur.g:525:3: ( 'TASK_STARTED' )
                    // InternalPartitur.g:525:4: 'TASK_STARTED'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getTASK_STARTEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPartitur.g:529:2: ( ( 'TASK_COMPLETED' ) )
                    {
                    // InternalPartitur.g:529:2: ( ( 'TASK_COMPLETED' ) )
                    // InternalPartitur.g:530:3: ( 'TASK_COMPLETED' )
                    {
                     before(grammarAccess.getEventTypeAccess().getTASK_COMPLETEDEnumLiteralDeclaration_1()); 
                    // InternalPartitur.g:531:3: ( 'TASK_COMPLETED' )
                    // InternalPartitur.g:531:4: 'TASK_COMPLETED'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getTASK_COMPLETEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPartitur.g:535:2: ( ( 'TASK_TIMEDOUT' ) )
                    {
                    // InternalPartitur.g:535:2: ( ( 'TASK_TIMEDOUT' ) )
                    // InternalPartitur.g:536:3: ( 'TASK_TIMEDOUT' )
                    {
                     before(grammarAccess.getEventTypeAccess().getTASK_TIMEDOUTEnumLiteralDeclaration_2()); 
                    // InternalPartitur.g:537:3: ( 'TASK_TIMEDOUT' )
                    // InternalPartitur.g:537:4: 'TASK_TIMEDOUT'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getTASK_TIMEDOUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPartitur.g:541:2: ( ( 'TASK_FAILED' ) )
                    {
                    // InternalPartitur.g:541:2: ( ( 'TASK_FAILED' ) )
                    // InternalPartitur.g:542:3: ( 'TASK_FAILED' )
                    {
                     before(grammarAccess.getEventTypeAccess().getTASK_FAILEDEnumLiteralDeclaration_3()); 
                    // InternalPartitur.g:543:3: ( 'TASK_FAILED' )
                    // InternalPartitur.g:543:4: 'TASK_FAILED'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getTASK_FAILEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPartitur.g:547:2: ( ( 'WORKFLOW_SCHEDULED' ) )
                    {
                    // InternalPartitur.g:547:2: ( ( 'WORKFLOW_SCHEDULED' ) )
                    // InternalPartitur.g:548:3: ( 'WORKFLOW_SCHEDULED' )
                    {
                     before(grammarAccess.getEventTypeAccess().getWORKFLOW_SCHEDULEDEnumLiteralDeclaration_4()); 
                    // InternalPartitur.g:549:3: ( 'WORKFLOW_SCHEDULED' )
                    // InternalPartitur.g:549:4: 'WORKFLOW_SCHEDULED'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getWORKFLOW_SCHEDULEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPartitur.g:553:2: ( ( 'WORKFLOW_STARTED' ) )
                    {
                    // InternalPartitur.g:553:2: ( ( 'WORKFLOW_STARTED' ) )
                    // InternalPartitur.g:554:3: ( 'WORKFLOW_STARTED' )
                    {
                     before(grammarAccess.getEventTypeAccess().getWORKFLOW_STARTEDEnumLiteralDeclaration_5()); 
                    // InternalPartitur.g:555:3: ( 'WORKFLOW_STARTED' )
                    // InternalPartitur.g:555:4: 'WORKFLOW_STARTED'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getWORKFLOW_STARTEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPartitur.g:559:2: ( ( 'WORKFLOW_COMPLETED' ) )
                    {
                    // InternalPartitur.g:559:2: ( ( 'WORKFLOW_COMPLETED' ) )
                    // InternalPartitur.g:560:3: ( 'WORKFLOW_COMPLETED' )
                    {
                     before(grammarAccess.getEventTypeAccess().getWORKFLOW_COMPLETEDEnumLiteralDeclaration_6()); 
                    // InternalPartitur.g:561:3: ( 'WORKFLOW_COMPLETED' )
                    // InternalPartitur.g:561:4: 'WORKFLOW_COMPLETED'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getWORKFLOW_COMPLETEDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Alternatives"


    // $ANTLR start "rule__PartiturWorkflow__Group__0"
    // InternalPartitur.g:569:1: rule__PartiturWorkflow__Group__0 : rule__PartiturWorkflow__Group__0__Impl rule__PartiturWorkflow__Group__1 ;
    public final void rule__PartiturWorkflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:573:1: ( rule__PartiturWorkflow__Group__0__Impl rule__PartiturWorkflow__Group__1 )
            // InternalPartitur.g:574:2: rule__PartiturWorkflow__Group__0__Impl rule__PartiturWorkflow__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PartiturWorkflow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__0"


    // $ANTLR start "rule__PartiturWorkflow__Group__0__Impl"
    // InternalPartitur.g:581:1: rule__PartiturWorkflow__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__PartiturWorkflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:585:1: ( ( 'workflow' ) )
            // InternalPartitur.g:586:1: ( 'workflow' )
            {
            // InternalPartitur.g:586:1: ( 'workflow' )
            // InternalPartitur.g:587:2: 'workflow'
            {
             before(grammarAccess.getPartiturWorkflowAccess().getWorkflowKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPartiturWorkflowAccess().getWorkflowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__0__Impl"


    // $ANTLR start "rule__PartiturWorkflow__Group__1"
    // InternalPartitur.g:596:1: rule__PartiturWorkflow__Group__1 : rule__PartiturWorkflow__Group__1__Impl rule__PartiturWorkflow__Group__2 ;
    public final void rule__PartiturWorkflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:600:1: ( rule__PartiturWorkflow__Group__1__Impl rule__PartiturWorkflow__Group__2 )
            // InternalPartitur.g:601:2: rule__PartiturWorkflow__Group__1__Impl rule__PartiturWorkflow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PartiturWorkflow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__1"


    // $ANTLR start "rule__PartiturWorkflow__Group__1__Impl"
    // InternalPartitur.g:608:1: rule__PartiturWorkflow__Group__1__Impl : ( ( rule__PartiturWorkflow__NameAssignment_1 ) ) ;
    public final void rule__PartiturWorkflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:612:1: ( ( ( rule__PartiturWorkflow__NameAssignment_1 ) ) )
            // InternalPartitur.g:613:1: ( ( rule__PartiturWorkflow__NameAssignment_1 ) )
            {
            // InternalPartitur.g:613:1: ( ( rule__PartiturWorkflow__NameAssignment_1 ) )
            // InternalPartitur.g:614:2: ( rule__PartiturWorkflow__NameAssignment_1 )
            {
             before(grammarAccess.getPartiturWorkflowAccess().getNameAssignment_1()); 
            // InternalPartitur.g:615:2: ( rule__PartiturWorkflow__NameAssignment_1 )
            // InternalPartitur.g:615:3: rule__PartiturWorkflow__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartiturWorkflowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__1__Impl"


    // $ANTLR start "rule__PartiturWorkflow__Group__2"
    // InternalPartitur.g:623:1: rule__PartiturWorkflow__Group__2 : rule__PartiturWorkflow__Group__2__Impl rule__PartiturWorkflow__Group__3 ;
    public final void rule__PartiturWorkflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:627:1: ( rule__PartiturWorkflow__Group__2__Impl rule__PartiturWorkflow__Group__3 )
            // InternalPartitur.g:628:2: rule__PartiturWorkflow__Group__2__Impl rule__PartiturWorkflow__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PartiturWorkflow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__2"


    // $ANTLR start "rule__PartiturWorkflow__Group__2__Impl"
    // InternalPartitur.g:635:1: rule__PartiturWorkflow__Group__2__Impl : ( '{' ) ;
    public final void rule__PartiturWorkflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:639:1: ( ( '{' ) )
            // InternalPartitur.g:640:1: ( '{' )
            {
            // InternalPartitur.g:640:1: ( '{' )
            // InternalPartitur.g:641:2: '{'
            {
             before(grammarAccess.getPartiturWorkflowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPartiturWorkflowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__2__Impl"


    // $ANTLR start "rule__PartiturWorkflow__Group__3"
    // InternalPartitur.g:650:1: rule__PartiturWorkflow__Group__3 : rule__PartiturWorkflow__Group__3__Impl rule__PartiturWorkflow__Group__4 ;
    public final void rule__PartiturWorkflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:654:1: ( rule__PartiturWorkflow__Group__3__Impl rule__PartiturWorkflow__Group__4 )
            // InternalPartitur.g:655:2: rule__PartiturWorkflow__Group__3__Impl rule__PartiturWorkflow__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PartiturWorkflow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__3"


    // $ANTLR start "rule__PartiturWorkflow__Group__3__Impl"
    // InternalPartitur.g:662:1: rule__PartiturWorkflow__Group__3__Impl : ( ( rule__PartiturWorkflow__TasksAssignment_3 )* ) ;
    public final void rule__PartiturWorkflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:666:1: ( ( ( rule__PartiturWorkflow__TasksAssignment_3 )* ) )
            // InternalPartitur.g:667:1: ( ( rule__PartiturWorkflow__TasksAssignment_3 )* )
            {
            // InternalPartitur.g:667:1: ( ( rule__PartiturWorkflow__TasksAssignment_3 )* )
            // InternalPartitur.g:668:2: ( rule__PartiturWorkflow__TasksAssignment_3 )*
            {
             before(grammarAccess.getPartiturWorkflowAccess().getTasksAssignment_3()); 
            // InternalPartitur.g:669:2: ( rule__PartiturWorkflow__TasksAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPartitur.g:669:3: rule__PartiturWorkflow__TasksAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PartiturWorkflow__TasksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPartiturWorkflowAccess().getTasksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__3__Impl"


    // $ANTLR start "rule__PartiturWorkflow__Group__4"
    // InternalPartitur.g:677:1: rule__PartiturWorkflow__Group__4 : rule__PartiturWorkflow__Group__4__Impl rule__PartiturWorkflow__Group__5 ;
    public final void rule__PartiturWorkflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:681:1: ( rule__PartiturWorkflow__Group__4__Impl rule__PartiturWorkflow__Group__5 )
            // InternalPartitur.g:682:2: rule__PartiturWorkflow__Group__4__Impl rule__PartiturWorkflow__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__PartiturWorkflow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__4"


    // $ANTLR start "rule__PartiturWorkflow__Group__4__Impl"
    // InternalPartitur.g:689:1: rule__PartiturWorkflow__Group__4__Impl : ( ( rule__PartiturWorkflow__HandlersAssignment_4 )* ) ;
    public final void rule__PartiturWorkflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:693:1: ( ( ( rule__PartiturWorkflow__HandlersAssignment_4 )* ) )
            // InternalPartitur.g:694:1: ( ( rule__PartiturWorkflow__HandlersAssignment_4 )* )
            {
            // InternalPartitur.g:694:1: ( ( rule__PartiturWorkflow__HandlersAssignment_4 )* )
            // InternalPartitur.g:695:2: ( rule__PartiturWorkflow__HandlersAssignment_4 )*
            {
             before(grammarAccess.getPartiturWorkflowAccess().getHandlersAssignment_4()); 
            // InternalPartitur.g:696:2: ( rule__PartiturWorkflow__HandlersAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPartitur.g:696:3: rule__PartiturWorkflow__HandlersAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PartiturWorkflow__HandlersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPartiturWorkflowAccess().getHandlersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__4__Impl"


    // $ANTLR start "rule__PartiturWorkflow__Group__5"
    // InternalPartitur.g:704:1: rule__PartiturWorkflow__Group__5 : rule__PartiturWorkflow__Group__5__Impl ;
    public final void rule__PartiturWorkflow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:708:1: ( rule__PartiturWorkflow__Group__5__Impl )
            // InternalPartitur.g:709:2: rule__PartiturWorkflow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartiturWorkflow__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__5"


    // $ANTLR start "rule__PartiturWorkflow__Group__5__Impl"
    // InternalPartitur.g:715:1: rule__PartiturWorkflow__Group__5__Impl : ( '}' ) ;
    public final void rule__PartiturWorkflow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:719:1: ( ( '}' ) )
            // InternalPartitur.g:720:1: ( '}' )
            {
            // InternalPartitur.g:720:1: ( '}' )
            // InternalPartitur.g:721:2: '}'
            {
             before(grammarAccess.getPartiturWorkflowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPartiturWorkflowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__Group__5__Impl"


    // $ANTLR start "rule__PartiturTask__Group__0"
    // InternalPartitur.g:731:1: rule__PartiturTask__Group__0 : rule__PartiturTask__Group__0__Impl rule__PartiturTask__Group__1 ;
    public final void rule__PartiturTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:735:1: ( rule__PartiturTask__Group__0__Impl rule__PartiturTask__Group__1 )
            // InternalPartitur.g:736:2: rule__PartiturTask__Group__0__Impl rule__PartiturTask__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PartiturTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__0"


    // $ANTLR start "rule__PartiturTask__Group__0__Impl"
    // InternalPartitur.g:743:1: rule__PartiturTask__Group__0__Impl : ( 'task' ) ;
    public final void rule__PartiturTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:747:1: ( ( 'task' ) )
            // InternalPartitur.g:748:1: ( 'task' )
            {
            // InternalPartitur.g:748:1: ( 'task' )
            // InternalPartitur.g:749:2: 'task'
            {
             before(grammarAccess.getPartiturTaskAccess().getTaskKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPartiturTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__0__Impl"


    // $ANTLR start "rule__PartiturTask__Group__1"
    // InternalPartitur.g:758:1: rule__PartiturTask__Group__1 : rule__PartiturTask__Group__1__Impl rule__PartiturTask__Group__2 ;
    public final void rule__PartiturTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:762:1: ( rule__PartiturTask__Group__1__Impl rule__PartiturTask__Group__2 )
            // InternalPartitur.g:763:2: rule__PartiturTask__Group__1__Impl rule__PartiturTask__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PartiturTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__1"


    // $ANTLR start "rule__PartiturTask__Group__1__Impl"
    // InternalPartitur.g:770:1: rule__PartiturTask__Group__1__Impl : ( ( rule__PartiturTask__NameAssignment_1 ) ) ;
    public final void rule__PartiturTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:774:1: ( ( ( rule__PartiturTask__NameAssignment_1 ) ) )
            // InternalPartitur.g:775:1: ( ( rule__PartiturTask__NameAssignment_1 ) )
            {
            // InternalPartitur.g:775:1: ( ( rule__PartiturTask__NameAssignment_1 ) )
            // InternalPartitur.g:776:2: ( rule__PartiturTask__NameAssignment_1 )
            {
             before(grammarAccess.getPartiturTaskAccess().getNameAssignment_1()); 
            // InternalPartitur.g:777:2: ( rule__PartiturTask__NameAssignment_1 )
            // InternalPartitur.g:777:3: rule__PartiturTask__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PartiturTask__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartiturTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__1__Impl"


    // $ANTLR start "rule__PartiturTask__Group__2"
    // InternalPartitur.g:785:1: rule__PartiturTask__Group__2 : rule__PartiturTask__Group__2__Impl rule__PartiturTask__Group__3 ;
    public final void rule__PartiturTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:789:1: ( rule__PartiturTask__Group__2__Impl rule__PartiturTask__Group__3 )
            // InternalPartitur.g:790:2: rule__PartiturTask__Group__2__Impl rule__PartiturTask__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PartiturTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__2"


    // $ANTLR start "rule__PartiturTask__Group__2__Impl"
    // InternalPartitur.g:797:1: rule__PartiturTask__Group__2__Impl : ( '{' ) ;
    public final void rule__PartiturTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:801:1: ( ( '{' ) )
            // InternalPartitur.g:802:1: ( '{' )
            {
            // InternalPartitur.g:802:1: ( '{' )
            // InternalPartitur.g:803:2: '{'
            {
             before(grammarAccess.getPartiturTaskAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPartiturTaskAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__2__Impl"


    // $ANTLR start "rule__PartiturTask__Group__3"
    // InternalPartitur.g:812:1: rule__PartiturTask__Group__3 : rule__PartiturTask__Group__3__Impl rule__PartiturTask__Group__4 ;
    public final void rule__PartiturTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:816:1: ( rule__PartiturTask__Group__3__Impl rule__PartiturTask__Group__4 )
            // InternalPartitur.g:817:2: rule__PartiturTask__Group__3__Impl rule__PartiturTask__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__PartiturTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__3"


    // $ANTLR start "rule__PartiturTask__Group__3__Impl"
    // InternalPartitur.g:824:1: rule__PartiturTask__Group__3__Impl : ( ( rule__PartiturTask__Alternatives_3 ) ) ;
    public final void rule__PartiturTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:828:1: ( ( ( rule__PartiturTask__Alternatives_3 ) ) )
            // InternalPartitur.g:829:1: ( ( rule__PartiturTask__Alternatives_3 ) )
            {
            // InternalPartitur.g:829:1: ( ( rule__PartiturTask__Alternatives_3 ) )
            // InternalPartitur.g:830:2: ( rule__PartiturTask__Alternatives_3 )
            {
             before(grammarAccess.getPartiturTaskAccess().getAlternatives_3()); 
            // InternalPartitur.g:831:2: ( rule__PartiturTask__Alternatives_3 )
            // InternalPartitur.g:831:3: rule__PartiturTask__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__PartiturTask__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPartiturTaskAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__3__Impl"


    // $ANTLR start "rule__PartiturTask__Group__4"
    // InternalPartitur.g:839:1: rule__PartiturTask__Group__4 : rule__PartiturTask__Group__4__Impl ;
    public final void rule__PartiturTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:843:1: ( rule__PartiturTask__Group__4__Impl )
            // InternalPartitur.g:844:2: rule__PartiturTask__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartiturTask__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__4"


    // $ANTLR start "rule__PartiturTask__Group__4__Impl"
    // InternalPartitur.g:850:1: rule__PartiturTask__Group__4__Impl : ( '}' ) ;
    public final void rule__PartiturTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:854:1: ( ( '}' ) )
            // InternalPartitur.g:855:1: ( '}' )
            {
            // InternalPartitur.g:855:1: ( '}' )
            // InternalPartitur.g:856:2: '}'
            {
             before(grammarAccess.getPartiturTaskAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPartiturTaskAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__Group__4__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__0"
    // InternalPartitur.g:866:1: rule__PartiturHandler__Group__0 : rule__PartiturHandler__Group__0__Impl rule__PartiturHandler__Group__1 ;
    public final void rule__PartiturHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:870:1: ( rule__PartiturHandler__Group__0__Impl rule__PartiturHandler__Group__1 )
            // InternalPartitur.g:871:2: rule__PartiturHandler__Group__0__Impl rule__PartiturHandler__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PartiturHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__0"


    // $ANTLR start "rule__PartiturHandler__Group__0__Impl"
    // InternalPartitur.g:878:1: rule__PartiturHandler__Group__0__Impl : ( 'handler' ) ;
    public final void rule__PartiturHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:882:1: ( ( 'handler' ) )
            // InternalPartitur.g:883:1: ( 'handler' )
            {
            // InternalPartitur.g:883:1: ( 'handler' )
            // InternalPartitur.g:884:2: 'handler'
            {
             before(grammarAccess.getPartiturHandlerAccess().getHandlerKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getHandlerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__0__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__1"
    // InternalPartitur.g:893:1: rule__PartiturHandler__Group__1 : rule__PartiturHandler__Group__1__Impl rule__PartiturHandler__Group__2 ;
    public final void rule__PartiturHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:897:1: ( rule__PartiturHandler__Group__1__Impl rule__PartiturHandler__Group__2 )
            // InternalPartitur.g:898:2: rule__PartiturHandler__Group__1__Impl rule__PartiturHandler__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PartiturHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__1"


    // $ANTLR start "rule__PartiturHandler__Group__1__Impl"
    // InternalPartitur.g:905:1: rule__PartiturHandler__Group__1__Impl : ( ( rule__PartiturHandler__NameAssignment_1 ) ) ;
    public final void rule__PartiturHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:909:1: ( ( ( rule__PartiturHandler__NameAssignment_1 ) ) )
            // InternalPartitur.g:910:1: ( ( rule__PartiturHandler__NameAssignment_1 ) )
            {
            // InternalPartitur.g:910:1: ( ( rule__PartiturHandler__NameAssignment_1 ) )
            // InternalPartitur.g:911:2: ( rule__PartiturHandler__NameAssignment_1 )
            {
             before(grammarAccess.getPartiturHandlerAccess().getNameAssignment_1()); 
            // InternalPartitur.g:912:2: ( rule__PartiturHandler__NameAssignment_1 )
            // InternalPartitur.g:912:3: rule__PartiturHandler__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartiturHandlerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__1__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__2"
    // InternalPartitur.g:920:1: rule__PartiturHandler__Group__2 : rule__PartiturHandler__Group__2__Impl rule__PartiturHandler__Group__3 ;
    public final void rule__PartiturHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:924:1: ( rule__PartiturHandler__Group__2__Impl rule__PartiturHandler__Group__3 )
            // InternalPartitur.g:925:2: rule__PartiturHandler__Group__2__Impl rule__PartiturHandler__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PartiturHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__2"


    // $ANTLR start "rule__PartiturHandler__Group__2__Impl"
    // InternalPartitur.g:932:1: rule__PartiturHandler__Group__2__Impl : ( '{' ) ;
    public final void rule__PartiturHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:936:1: ( ( '{' ) )
            // InternalPartitur.g:937:1: ( '{' )
            {
            // InternalPartitur.g:937:1: ( '{' )
            // InternalPartitur.g:938:2: '{'
            {
             before(grammarAccess.getPartiturHandlerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__2__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__3"
    // InternalPartitur.g:947:1: rule__PartiturHandler__Group__3 : rule__PartiturHandler__Group__3__Impl rule__PartiturHandler__Group__4 ;
    public final void rule__PartiturHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:951:1: ( rule__PartiturHandler__Group__3__Impl rule__PartiturHandler__Group__4 )
            // InternalPartitur.g:952:2: rule__PartiturHandler__Group__3__Impl rule__PartiturHandler__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__PartiturHandler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__3"


    // $ANTLR start "rule__PartiturHandler__Group__3__Impl"
    // InternalPartitur.g:959:1: rule__PartiturHandler__Group__3__Impl : ( 'on' ) ;
    public final void rule__PartiturHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:963:1: ( ( 'on' ) )
            // InternalPartitur.g:964:1: ( 'on' )
            {
            // InternalPartitur.g:964:1: ( 'on' )
            // InternalPartitur.g:965:2: 'on'
            {
             before(grammarAccess.getPartiturHandlerAccess().getOnKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__3__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__4"
    // InternalPartitur.g:974:1: rule__PartiturHandler__Group__4 : rule__PartiturHandler__Group__4__Impl rule__PartiturHandler__Group__5 ;
    public final void rule__PartiturHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:978:1: ( rule__PartiturHandler__Group__4__Impl rule__PartiturHandler__Group__5 )
            // InternalPartitur.g:979:2: rule__PartiturHandler__Group__4__Impl rule__PartiturHandler__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__PartiturHandler__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__4"


    // $ANTLR start "rule__PartiturHandler__Group__4__Impl"
    // InternalPartitur.g:986:1: rule__PartiturHandler__Group__4__Impl : ( ( rule__PartiturHandler__EventAssignment_4 ) ) ;
    public final void rule__PartiturHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:990:1: ( ( ( rule__PartiturHandler__EventAssignment_4 ) ) )
            // InternalPartitur.g:991:1: ( ( rule__PartiturHandler__EventAssignment_4 ) )
            {
            // InternalPartitur.g:991:1: ( ( rule__PartiturHandler__EventAssignment_4 ) )
            // InternalPartitur.g:992:2: ( rule__PartiturHandler__EventAssignment_4 )
            {
             before(grammarAccess.getPartiturHandlerAccess().getEventAssignment_4()); 
            // InternalPartitur.g:993:2: ( rule__PartiturHandler__EventAssignment_4 )
            // InternalPartitur.g:993:3: rule__PartiturHandler__EventAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__EventAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPartiturHandlerAccess().getEventAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__4__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__5"
    // InternalPartitur.g:1001:1: rule__PartiturHandler__Group__5 : rule__PartiturHandler__Group__5__Impl rule__PartiturHandler__Group__6 ;
    public final void rule__PartiturHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1005:1: ( rule__PartiturHandler__Group__5__Impl rule__PartiturHandler__Group__6 )
            // InternalPartitur.g:1006:2: rule__PartiturHandler__Group__5__Impl rule__PartiturHandler__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__PartiturHandler__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__5"


    // $ANTLR start "rule__PartiturHandler__Group__5__Impl"
    // InternalPartitur.g:1013:1: rule__PartiturHandler__Group__5__Impl : ( 'when' ) ;
    public final void rule__PartiturHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1017:1: ( ( 'when' ) )
            // InternalPartitur.g:1018:1: ( 'when' )
            {
            // InternalPartitur.g:1018:1: ( 'when' )
            // InternalPartitur.g:1019:2: 'when'
            {
             before(grammarAccess.getPartiturHandlerAccess().getWhenKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getWhenKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__5__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__6"
    // InternalPartitur.g:1028:1: rule__PartiturHandler__Group__6 : rule__PartiturHandler__Group__6__Impl rule__PartiturHandler__Group__7 ;
    public final void rule__PartiturHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1032:1: ( rule__PartiturHandler__Group__6__Impl rule__PartiturHandler__Group__7 )
            // InternalPartitur.g:1033:2: rule__PartiturHandler__Group__6__Impl rule__PartiturHandler__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__PartiturHandler__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__6"


    // $ANTLR start "rule__PartiturHandler__Group__6__Impl"
    // InternalPartitur.g:1040:1: rule__PartiturHandler__Group__6__Impl : ( ( rule__PartiturHandler__ConditionsAssignment_6 ) ) ;
    public final void rule__PartiturHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1044:1: ( ( ( rule__PartiturHandler__ConditionsAssignment_6 ) ) )
            // InternalPartitur.g:1045:1: ( ( rule__PartiturHandler__ConditionsAssignment_6 ) )
            {
            // InternalPartitur.g:1045:1: ( ( rule__PartiturHandler__ConditionsAssignment_6 ) )
            // InternalPartitur.g:1046:2: ( rule__PartiturHandler__ConditionsAssignment_6 )
            {
             before(grammarAccess.getPartiturHandlerAccess().getConditionsAssignment_6()); 
            // InternalPartitur.g:1047:2: ( rule__PartiturHandler__ConditionsAssignment_6 )
            // InternalPartitur.g:1047:3: rule__PartiturHandler__ConditionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__ConditionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPartiturHandlerAccess().getConditionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__6__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__7"
    // InternalPartitur.g:1055:1: rule__PartiturHandler__Group__7 : rule__PartiturHandler__Group__7__Impl rule__PartiturHandler__Group__8 ;
    public final void rule__PartiturHandler__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1059:1: ( rule__PartiturHandler__Group__7__Impl rule__PartiturHandler__Group__8 )
            // InternalPartitur.g:1060:2: rule__PartiturHandler__Group__7__Impl rule__PartiturHandler__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__PartiturHandler__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__7"


    // $ANTLR start "rule__PartiturHandler__Group__7__Impl"
    // InternalPartitur.g:1067:1: rule__PartiturHandler__Group__7__Impl : ( ( rule__PartiturHandler__Group_7__0 )* ) ;
    public final void rule__PartiturHandler__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1071:1: ( ( ( rule__PartiturHandler__Group_7__0 )* ) )
            // InternalPartitur.g:1072:1: ( ( rule__PartiturHandler__Group_7__0 )* )
            {
            // InternalPartitur.g:1072:1: ( ( rule__PartiturHandler__Group_7__0 )* )
            // InternalPartitur.g:1073:2: ( rule__PartiturHandler__Group_7__0 )*
            {
             before(grammarAccess.getPartiturHandlerAccess().getGroup_7()); 
            // InternalPartitur.g:1074:2: ( rule__PartiturHandler__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPartitur.g:1074:3: rule__PartiturHandler__Group_7__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PartiturHandler__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPartiturHandlerAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__7__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__8"
    // InternalPartitur.g:1082:1: rule__PartiturHandler__Group__8 : rule__PartiturHandler__Group__8__Impl rule__PartiturHandler__Group__9 ;
    public final void rule__PartiturHandler__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1086:1: ( rule__PartiturHandler__Group__8__Impl rule__PartiturHandler__Group__9 )
            // InternalPartitur.g:1087:2: rule__PartiturHandler__Group__8__Impl rule__PartiturHandler__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__PartiturHandler__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__8"


    // $ANTLR start "rule__PartiturHandler__Group__8__Impl"
    // InternalPartitur.g:1094:1: rule__PartiturHandler__Group__8__Impl : ( 'then' ) ;
    public final void rule__PartiturHandler__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1098:1: ( ( 'then' ) )
            // InternalPartitur.g:1099:1: ( 'then' )
            {
            // InternalPartitur.g:1099:1: ( 'then' )
            // InternalPartitur.g:1100:2: 'then'
            {
             before(grammarAccess.getPartiturHandlerAccess().getThenKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getThenKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__8__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__9"
    // InternalPartitur.g:1109:1: rule__PartiturHandler__Group__9 : rule__PartiturHandler__Group__9__Impl rule__PartiturHandler__Group__10 ;
    public final void rule__PartiturHandler__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1113:1: ( rule__PartiturHandler__Group__9__Impl rule__PartiturHandler__Group__10 )
            // InternalPartitur.g:1114:2: rule__PartiturHandler__Group__9__Impl rule__PartiturHandler__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__PartiturHandler__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__9"


    // $ANTLR start "rule__PartiturHandler__Group__9__Impl"
    // InternalPartitur.g:1121:1: rule__PartiturHandler__Group__9__Impl : ( ( rule__PartiturHandler__CommandsAssignment_9 ) ) ;
    public final void rule__PartiturHandler__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1125:1: ( ( ( rule__PartiturHandler__CommandsAssignment_9 ) ) )
            // InternalPartitur.g:1126:1: ( ( rule__PartiturHandler__CommandsAssignment_9 ) )
            {
            // InternalPartitur.g:1126:1: ( ( rule__PartiturHandler__CommandsAssignment_9 ) )
            // InternalPartitur.g:1127:2: ( rule__PartiturHandler__CommandsAssignment_9 )
            {
             before(grammarAccess.getPartiturHandlerAccess().getCommandsAssignment_9()); 
            // InternalPartitur.g:1128:2: ( rule__PartiturHandler__CommandsAssignment_9 )
            // InternalPartitur.g:1128:3: rule__PartiturHandler__CommandsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__CommandsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPartiturHandlerAccess().getCommandsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__9__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__10"
    // InternalPartitur.g:1136:1: rule__PartiturHandler__Group__10 : rule__PartiturHandler__Group__10__Impl rule__PartiturHandler__Group__11 ;
    public final void rule__PartiturHandler__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1140:1: ( rule__PartiturHandler__Group__10__Impl rule__PartiturHandler__Group__11 )
            // InternalPartitur.g:1141:2: rule__PartiturHandler__Group__10__Impl rule__PartiturHandler__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__PartiturHandler__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__10"


    // $ANTLR start "rule__PartiturHandler__Group__10__Impl"
    // InternalPartitur.g:1148:1: rule__PartiturHandler__Group__10__Impl : ( ( rule__PartiturHandler__Group_10__0 )* ) ;
    public final void rule__PartiturHandler__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1152:1: ( ( ( rule__PartiturHandler__Group_10__0 )* ) )
            // InternalPartitur.g:1153:1: ( ( rule__PartiturHandler__Group_10__0 )* )
            {
            // InternalPartitur.g:1153:1: ( ( rule__PartiturHandler__Group_10__0 )* )
            // InternalPartitur.g:1154:2: ( rule__PartiturHandler__Group_10__0 )*
            {
             before(grammarAccess.getPartiturHandlerAccess().getGroup_10()); 
            // InternalPartitur.g:1155:2: ( rule__PartiturHandler__Group_10__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPartitur.g:1155:3: rule__PartiturHandler__Group_10__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PartiturHandler__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPartiturHandlerAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__10__Impl"


    // $ANTLR start "rule__PartiturHandler__Group__11"
    // InternalPartitur.g:1163:1: rule__PartiturHandler__Group__11 : rule__PartiturHandler__Group__11__Impl ;
    public final void rule__PartiturHandler__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1167:1: ( rule__PartiturHandler__Group__11__Impl )
            // InternalPartitur.g:1168:2: rule__PartiturHandler__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__11"


    // $ANTLR start "rule__PartiturHandler__Group__11__Impl"
    // InternalPartitur.g:1174:1: rule__PartiturHandler__Group__11__Impl : ( '}' ) ;
    public final void rule__PartiturHandler__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1178:1: ( ( '}' ) )
            // InternalPartitur.g:1179:1: ( '}' )
            {
            // InternalPartitur.g:1179:1: ( '}' )
            // InternalPartitur.g:1180:2: '}'
            {
             before(grammarAccess.getPartiturHandlerAccess().getRightCurlyBracketKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group__11__Impl"


    // $ANTLR start "rule__PartiturHandler__Group_7__0"
    // InternalPartitur.g:1190:1: rule__PartiturHandler__Group_7__0 : rule__PartiturHandler__Group_7__0__Impl rule__PartiturHandler__Group_7__1 ;
    public final void rule__PartiturHandler__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1194:1: ( rule__PartiturHandler__Group_7__0__Impl rule__PartiturHandler__Group_7__1 )
            // InternalPartitur.g:1195:2: rule__PartiturHandler__Group_7__0__Impl rule__PartiturHandler__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__PartiturHandler__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_7__0"


    // $ANTLR start "rule__PartiturHandler__Group_7__0__Impl"
    // InternalPartitur.g:1202:1: rule__PartiturHandler__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PartiturHandler__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1206:1: ( ( ',' ) )
            // InternalPartitur.g:1207:1: ( ',' )
            {
            // InternalPartitur.g:1207:1: ( ',' )
            // InternalPartitur.g:1208:2: ','
            {
             before(grammarAccess.getPartiturHandlerAccess().getCommaKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_7__0__Impl"


    // $ANTLR start "rule__PartiturHandler__Group_7__1"
    // InternalPartitur.g:1217:1: rule__PartiturHandler__Group_7__1 : rule__PartiturHandler__Group_7__1__Impl ;
    public final void rule__PartiturHandler__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1221:1: ( rule__PartiturHandler__Group_7__1__Impl )
            // InternalPartitur.g:1222:2: rule__PartiturHandler__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_7__1"


    // $ANTLR start "rule__PartiturHandler__Group_7__1__Impl"
    // InternalPartitur.g:1228:1: rule__PartiturHandler__Group_7__1__Impl : ( ( rule__PartiturHandler__ConditionsAssignment_7_1 ) ) ;
    public final void rule__PartiturHandler__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1232:1: ( ( ( rule__PartiturHandler__ConditionsAssignment_7_1 ) ) )
            // InternalPartitur.g:1233:1: ( ( rule__PartiturHandler__ConditionsAssignment_7_1 ) )
            {
            // InternalPartitur.g:1233:1: ( ( rule__PartiturHandler__ConditionsAssignment_7_1 ) )
            // InternalPartitur.g:1234:2: ( rule__PartiturHandler__ConditionsAssignment_7_1 )
            {
             before(grammarAccess.getPartiturHandlerAccess().getConditionsAssignment_7_1()); 
            // InternalPartitur.g:1235:2: ( rule__PartiturHandler__ConditionsAssignment_7_1 )
            // InternalPartitur.g:1235:3: rule__PartiturHandler__ConditionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__ConditionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPartiturHandlerAccess().getConditionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_7__1__Impl"


    // $ANTLR start "rule__PartiturHandler__Group_10__0"
    // InternalPartitur.g:1244:1: rule__PartiturHandler__Group_10__0 : rule__PartiturHandler__Group_10__0__Impl rule__PartiturHandler__Group_10__1 ;
    public final void rule__PartiturHandler__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1248:1: ( rule__PartiturHandler__Group_10__0__Impl rule__PartiturHandler__Group_10__1 )
            // InternalPartitur.g:1249:2: rule__PartiturHandler__Group_10__0__Impl rule__PartiturHandler__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__PartiturHandler__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_10__0"


    // $ANTLR start "rule__PartiturHandler__Group_10__0__Impl"
    // InternalPartitur.g:1256:1: rule__PartiturHandler__Group_10__0__Impl : ( ',' ) ;
    public final void rule__PartiturHandler__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1260:1: ( ( ',' ) )
            // InternalPartitur.g:1261:1: ( ',' )
            {
            // InternalPartitur.g:1261:1: ( ',' )
            // InternalPartitur.g:1262:2: ','
            {
             before(grammarAccess.getPartiturHandlerAccess().getCommaKeyword_10_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_10__0__Impl"


    // $ANTLR start "rule__PartiturHandler__Group_10__1"
    // InternalPartitur.g:1271:1: rule__PartiturHandler__Group_10__1 : rule__PartiturHandler__Group_10__1__Impl ;
    public final void rule__PartiturHandler__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1275:1: ( rule__PartiturHandler__Group_10__1__Impl )
            // InternalPartitur.g:1276:2: rule__PartiturHandler__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_10__1"


    // $ANTLR start "rule__PartiturHandler__Group_10__1__Impl"
    // InternalPartitur.g:1282:1: rule__PartiturHandler__Group_10__1__Impl : ( ( rule__PartiturHandler__CommandsAssignment_10_1 ) ) ;
    public final void rule__PartiturHandler__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1286:1: ( ( ( rule__PartiturHandler__CommandsAssignment_10_1 ) ) )
            // InternalPartitur.g:1287:1: ( ( rule__PartiturHandler__CommandsAssignment_10_1 ) )
            {
            // InternalPartitur.g:1287:1: ( ( rule__PartiturHandler__CommandsAssignment_10_1 ) )
            // InternalPartitur.g:1288:2: ( rule__PartiturHandler__CommandsAssignment_10_1 )
            {
             before(grammarAccess.getPartiturHandlerAccess().getCommandsAssignment_10_1()); 
            // InternalPartitur.g:1289:2: ( rule__PartiturHandler__CommandsAssignment_10_1 )
            // InternalPartitur.g:1289:3: rule__PartiturHandler__CommandsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__PartiturHandler__CommandsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPartiturHandlerAccess().getCommandsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__Group_10__1__Impl"


    // $ANTLR start "rule__PartiturCondition__Group__0"
    // InternalPartitur.g:1298:1: rule__PartiturCondition__Group__0 : rule__PartiturCondition__Group__0__Impl rule__PartiturCondition__Group__1 ;
    public final void rule__PartiturCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1302:1: ( rule__PartiturCondition__Group__0__Impl rule__PartiturCondition__Group__1 )
            // InternalPartitur.g:1303:2: rule__PartiturCondition__Group__0__Impl rule__PartiturCondition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__PartiturCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__0"


    // $ANTLR start "rule__PartiturCondition__Group__0__Impl"
    // InternalPartitur.g:1310:1: rule__PartiturCondition__Group__0__Impl : ( ( rule__PartiturCondition__ConditionFunctionAssignment_0 ) ) ;
    public final void rule__PartiturCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1314:1: ( ( ( rule__PartiturCondition__ConditionFunctionAssignment_0 ) ) )
            // InternalPartitur.g:1315:1: ( ( rule__PartiturCondition__ConditionFunctionAssignment_0 ) )
            {
            // InternalPartitur.g:1315:1: ( ( rule__PartiturCondition__ConditionFunctionAssignment_0 ) )
            // InternalPartitur.g:1316:2: ( rule__PartiturCondition__ConditionFunctionAssignment_0 )
            {
             before(grammarAccess.getPartiturConditionAccess().getConditionFunctionAssignment_0()); 
            // InternalPartitur.g:1317:2: ( rule__PartiturCondition__ConditionFunctionAssignment_0 )
            // InternalPartitur.g:1317:3: rule__PartiturCondition__ConditionFunctionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCondition__ConditionFunctionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPartiturConditionAccess().getConditionFunctionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__0__Impl"


    // $ANTLR start "rule__PartiturCondition__Group__1"
    // InternalPartitur.g:1325:1: rule__PartiturCondition__Group__1 : rule__PartiturCondition__Group__1__Impl rule__PartiturCondition__Group__2 ;
    public final void rule__PartiturCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1329:1: ( rule__PartiturCondition__Group__1__Impl rule__PartiturCondition__Group__2 )
            // InternalPartitur.g:1330:2: rule__PartiturCondition__Group__1__Impl rule__PartiturCondition__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__PartiturCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__1"


    // $ANTLR start "rule__PartiturCondition__Group__1__Impl"
    // InternalPartitur.g:1337:1: rule__PartiturCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__PartiturCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1341:1: ( ( '(' ) )
            // InternalPartitur.g:1342:1: ( '(' )
            {
            // InternalPartitur.g:1342:1: ( '(' )
            // InternalPartitur.g:1343:2: '('
            {
             before(grammarAccess.getPartiturConditionAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPartiturConditionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__1__Impl"


    // $ANTLR start "rule__PartiturCondition__Group__2"
    // InternalPartitur.g:1352:1: rule__PartiturCondition__Group__2 : rule__PartiturCondition__Group__2__Impl rule__PartiturCondition__Group__3 ;
    public final void rule__PartiturCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1356:1: ( rule__PartiturCondition__Group__2__Impl rule__PartiturCondition__Group__3 )
            // InternalPartitur.g:1357:2: rule__PartiturCondition__Group__2__Impl rule__PartiturCondition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__PartiturCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__2"


    // $ANTLR start "rule__PartiturCondition__Group__2__Impl"
    // InternalPartitur.g:1364:1: rule__PartiturCondition__Group__2__Impl : ( ( rule__PartiturCondition__ArgAssignment_2 ) ) ;
    public final void rule__PartiturCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1368:1: ( ( ( rule__PartiturCondition__ArgAssignment_2 ) ) )
            // InternalPartitur.g:1369:1: ( ( rule__PartiturCondition__ArgAssignment_2 ) )
            {
            // InternalPartitur.g:1369:1: ( ( rule__PartiturCondition__ArgAssignment_2 ) )
            // InternalPartitur.g:1370:2: ( rule__PartiturCondition__ArgAssignment_2 )
            {
             before(grammarAccess.getPartiturConditionAccess().getArgAssignment_2()); 
            // InternalPartitur.g:1371:2: ( rule__PartiturCondition__ArgAssignment_2 )
            // InternalPartitur.g:1371:3: rule__PartiturCondition__ArgAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCondition__ArgAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartiturConditionAccess().getArgAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__2__Impl"


    // $ANTLR start "rule__PartiturCondition__Group__3"
    // InternalPartitur.g:1379:1: rule__PartiturCondition__Group__3 : rule__PartiturCondition__Group__3__Impl ;
    public final void rule__PartiturCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1383:1: ( rule__PartiturCondition__Group__3__Impl )
            // InternalPartitur.g:1384:2: rule__PartiturCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__3"


    // $ANTLR start "rule__PartiturCondition__Group__3__Impl"
    // InternalPartitur.g:1390:1: rule__PartiturCondition__Group__3__Impl : ( ')' ) ;
    public final void rule__PartiturCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1394:1: ( ( ')' ) )
            // InternalPartitur.g:1395:1: ( ')' )
            {
            // InternalPartitur.g:1395:1: ( ')' )
            // InternalPartitur.g:1396:2: ')'
            {
             before(grammarAccess.getPartiturConditionAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPartiturConditionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__Group__3__Impl"


    // $ANTLR start "rule__PartiturCommand__Group__0"
    // InternalPartitur.g:1406:1: rule__PartiturCommand__Group__0 : rule__PartiturCommand__Group__0__Impl rule__PartiturCommand__Group__1 ;
    public final void rule__PartiturCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1410:1: ( rule__PartiturCommand__Group__0__Impl rule__PartiturCommand__Group__1 )
            // InternalPartitur.g:1411:2: rule__PartiturCommand__Group__0__Impl rule__PartiturCommand__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__PartiturCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__0"


    // $ANTLR start "rule__PartiturCommand__Group__0__Impl"
    // InternalPartitur.g:1418:1: rule__PartiturCommand__Group__0__Impl : ( ( rule__PartiturCommand__CommandFunctionAssignment_0 ) ) ;
    public final void rule__PartiturCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1422:1: ( ( ( rule__PartiturCommand__CommandFunctionAssignment_0 ) ) )
            // InternalPartitur.g:1423:1: ( ( rule__PartiturCommand__CommandFunctionAssignment_0 ) )
            {
            // InternalPartitur.g:1423:1: ( ( rule__PartiturCommand__CommandFunctionAssignment_0 ) )
            // InternalPartitur.g:1424:2: ( rule__PartiturCommand__CommandFunctionAssignment_0 )
            {
             before(grammarAccess.getPartiturCommandAccess().getCommandFunctionAssignment_0()); 
            // InternalPartitur.g:1425:2: ( rule__PartiturCommand__CommandFunctionAssignment_0 )
            // InternalPartitur.g:1425:3: rule__PartiturCommand__CommandFunctionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCommand__CommandFunctionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPartiturCommandAccess().getCommandFunctionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__0__Impl"


    // $ANTLR start "rule__PartiturCommand__Group__1"
    // InternalPartitur.g:1433:1: rule__PartiturCommand__Group__1 : rule__PartiturCommand__Group__1__Impl rule__PartiturCommand__Group__2 ;
    public final void rule__PartiturCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1437:1: ( rule__PartiturCommand__Group__1__Impl rule__PartiturCommand__Group__2 )
            // InternalPartitur.g:1438:2: rule__PartiturCommand__Group__1__Impl rule__PartiturCommand__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__PartiturCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__1"


    // $ANTLR start "rule__PartiturCommand__Group__1__Impl"
    // InternalPartitur.g:1445:1: rule__PartiturCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__PartiturCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1449:1: ( ( '(' ) )
            // InternalPartitur.g:1450:1: ( '(' )
            {
            // InternalPartitur.g:1450:1: ( '(' )
            // InternalPartitur.g:1451:2: '('
            {
             before(grammarAccess.getPartiturCommandAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPartiturCommandAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__1__Impl"


    // $ANTLR start "rule__PartiturCommand__Group__2"
    // InternalPartitur.g:1460:1: rule__PartiturCommand__Group__2 : rule__PartiturCommand__Group__2__Impl rule__PartiturCommand__Group__3 ;
    public final void rule__PartiturCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1464:1: ( rule__PartiturCommand__Group__2__Impl rule__PartiturCommand__Group__3 )
            // InternalPartitur.g:1465:2: rule__PartiturCommand__Group__2__Impl rule__PartiturCommand__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__PartiturCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartiturCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__2"


    // $ANTLR start "rule__PartiturCommand__Group__2__Impl"
    // InternalPartitur.g:1472:1: rule__PartiturCommand__Group__2__Impl : ( ( rule__PartiturCommand__ArgAssignment_2 ) ) ;
    public final void rule__PartiturCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1476:1: ( ( ( rule__PartiturCommand__ArgAssignment_2 ) ) )
            // InternalPartitur.g:1477:1: ( ( rule__PartiturCommand__ArgAssignment_2 ) )
            {
            // InternalPartitur.g:1477:1: ( ( rule__PartiturCommand__ArgAssignment_2 ) )
            // InternalPartitur.g:1478:2: ( rule__PartiturCommand__ArgAssignment_2 )
            {
             before(grammarAccess.getPartiturCommandAccess().getArgAssignment_2()); 
            // InternalPartitur.g:1479:2: ( rule__PartiturCommand__ArgAssignment_2 )
            // InternalPartitur.g:1479:3: rule__PartiturCommand__ArgAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCommand__ArgAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartiturCommandAccess().getArgAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__2__Impl"


    // $ANTLR start "rule__PartiturCommand__Group__3"
    // InternalPartitur.g:1487:1: rule__PartiturCommand__Group__3 : rule__PartiturCommand__Group__3__Impl ;
    public final void rule__PartiturCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1491:1: ( rule__PartiturCommand__Group__3__Impl )
            // InternalPartitur.g:1492:2: rule__PartiturCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartiturCommand__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__3"


    // $ANTLR start "rule__PartiturCommand__Group__3__Impl"
    // InternalPartitur.g:1498:1: rule__PartiturCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__PartiturCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1502:1: ( ( ')' ) )
            // InternalPartitur.g:1503:1: ( ')' )
            {
            // InternalPartitur.g:1503:1: ( ')' )
            // InternalPartitur.g:1504:2: ')'
            {
             before(grammarAccess.getPartiturCommandAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPartiturCommandAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__Group__3__Impl"


    // $ANTLR start "rule__HttpGet__Group__0"
    // InternalPartitur.g:1514:1: rule__HttpGet__Group__0 : rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1 ;
    public final void rule__HttpGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1518:1: ( rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1 )
            // InternalPartitur.g:1519:2: rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__HttpGet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__0"


    // $ANTLR start "rule__HttpGet__Group__0__Impl"
    // InternalPartitur.g:1526:1: rule__HttpGet__Group__0__Impl : ( 'get' ) ;
    public final void rule__HttpGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1530:1: ( ( 'get' ) )
            // InternalPartitur.g:1531:1: ( 'get' )
            {
            // InternalPartitur.g:1531:1: ( 'get' )
            // InternalPartitur.g:1532:2: 'get'
            {
             before(grammarAccess.getHttpGetAccess().getGetKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getHttpGetAccess().getGetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__0__Impl"


    // $ANTLR start "rule__HttpGet__Group__1"
    // InternalPartitur.g:1541:1: rule__HttpGet__Group__1 : rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2 ;
    public final void rule__HttpGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1545:1: ( rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2 )
            // InternalPartitur.g:1546:2: rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__HttpGet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__1"


    // $ANTLR start "rule__HttpGet__Group__1__Impl"
    // InternalPartitur.g:1553:1: rule__HttpGet__Group__1__Impl : ( '(' ) ;
    public final void rule__HttpGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1557:1: ( ( '(' ) )
            // InternalPartitur.g:1558:1: ( '(' )
            {
            // InternalPartitur.g:1558:1: ( '(' )
            // InternalPartitur.g:1559:2: '('
            {
             before(grammarAccess.getHttpGetAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHttpGetAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__1__Impl"


    // $ANTLR start "rule__HttpGet__Group__2"
    // InternalPartitur.g:1568:1: rule__HttpGet__Group__2 : rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3 ;
    public final void rule__HttpGet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1572:1: ( rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3 )
            // InternalPartitur.g:1573:2: rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__HttpGet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__2"


    // $ANTLR start "rule__HttpGet__Group__2__Impl"
    // InternalPartitur.g:1580:1: rule__HttpGet__Group__2__Impl : ( ( rule__HttpGet__UrlAssignment_2 ) ) ;
    public final void rule__HttpGet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1584:1: ( ( ( rule__HttpGet__UrlAssignment_2 ) ) )
            // InternalPartitur.g:1585:1: ( ( rule__HttpGet__UrlAssignment_2 ) )
            {
            // InternalPartitur.g:1585:1: ( ( rule__HttpGet__UrlAssignment_2 ) )
            // InternalPartitur.g:1586:2: ( rule__HttpGet__UrlAssignment_2 )
            {
             before(grammarAccess.getHttpGetAccess().getUrlAssignment_2()); 
            // InternalPartitur.g:1587:2: ( rule__HttpGet__UrlAssignment_2 )
            // InternalPartitur.g:1587:3: rule__HttpGet__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HttpGet__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHttpGetAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__2__Impl"


    // $ANTLR start "rule__HttpGet__Group__3"
    // InternalPartitur.g:1595:1: rule__HttpGet__Group__3 : rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4 ;
    public final void rule__HttpGet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1599:1: ( rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4 )
            // InternalPartitur.g:1600:2: rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__HttpGet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__3"


    // $ANTLR start "rule__HttpGet__Group__3__Impl"
    // InternalPartitur.g:1607:1: rule__HttpGet__Group__3__Impl : ( ')' ) ;
    public final void rule__HttpGet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1611:1: ( ( ')' ) )
            // InternalPartitur.g:1612:1: ( ')' )
            {
            // InternalPartitur.g:1612:1: ( ')' )
            // InternalPartitur.g:1613:2: ')'
            {
             before(grammarAccess.getHttpGetAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHttpGetAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__3__Impl"


    // $ANTLR start "rule__HttpGet__Group__4"
    // InternalPartitur.g:1622:1: rule__HttpGet__Group__4 : rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5 ;
    public final void rule__HttpGet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1626:1: ( rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5 )
            // InternalPartitur.g:1627:2: rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__HttpGet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__4"


    // $ANTLR start "rule__HttpGet__Group__4__Impl"
    // InternalPartitur.g:1634:1: rule__HttpGet__Group__4__Impl : ( ( rule__HttpGet__UriVariablesAssignment_4 )? ) ;
    public final void rule__HttpGet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1638:1: ( ( ( rule__HttpGet__UriVariablesAssignment_4 )? ) )
            // InternalPartitur.g:1639:1: ( ( rule__HttpGet__UriVariablesAssignment_4 )? )
            {
            // InternalPartitur.g:1639:1: ( ( rule__HttpGet__UriVariablesAssignment_4 )? )
            // InternalPartitur.g:1640:2: ( rule__HttpGet__UriVariablesAssignment_4 )?
            {
             before(grammarAccess.getHttpGetAccess().getUriVariablesAssignment_4()); 
            // InternalPartitur.g:1641:2: ( rule__HttpGet__UriVariablesAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPartitur.g:1641:3: rule__HttpGet__UriVariablesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__HttpGet__UriVariablesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpGetAccess().getUriVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__4__Impl"


    // $ANTLR start "rule__HttpGet__Group__5"
    // InternalPartitur.g:1649:1: rule__HttpGet__Group__5 : rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6 ;
    public final void rule__HttpGet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1653:1: ( rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6 )
            // InternalPartitur.g:1654:2: rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__HttpGet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__5"


    // $ANTLR start "rule__HttpGet__Group__5__Impl"
    // InternalPartitur.g:1661:1: rule__HttpGet__Group__5__Impl : ( ( rule__HttpGet__HeadersAssignment_5 )* ) ;
    public final void rule__HttpGet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1665:1: ( ( ( rule__HttpGet__HeadersAssignment_5 )* ) )
            // InternalPartitur.g:1666:1: ( ( rule__HttpGet__HeadersAssignment_5 )* )
            {
            // InternalPartitur.g:1666:1: ( ( rule__HttpGet__HeadersAssignment_5 )* )
            // InternalPartitur.g:1667:2: ( rule__HttpGet__HeadersAssignment_5 )*
            {
             before(grammarAccess.getHttpGetAccess().getHeadersAssignment_5()); 
            // InternalPartitur.g:1668:2: ( rule__HttpGet__HeadersAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPartitur.g:1668:3: rule__HttpGet__HeadersAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__HttpGet__HeadersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getHttpGetAccess().getHeadersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__5__Impl"


    // $ANTLR start "rule__HttpGet__Group__6"
    // InternalPartitur.g:1676:1: rule__HttpGet__Group__6 : rule__HttpGet__Group__6__Impl ;
    public final void rule__HttpGet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1680:1: ( rule__HttpGet__Group__6__Impl )
            // InternalPartitur.g:1681:2: rule__HttpGet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HttpGet__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__6"


    // $ANTLR start "rule__HttpGet__Group__6__Impl"
    // InternalPartitur.g:1687:1: rule__HttpGet__Group__6__Impl : ( ( rule__HttpGet__ParamsAssignment_6 )* ) ;
    public final void rule__HttpGet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1691:1: ( ( ( rule__HttpGet__ParamsAssignment_6 )* ) )
            // InternalPartitur.g:1692:1: ( ( rule__HttpGet__ParamsAssignment_6 )* )
            {
            // InternalPartitur.g:1692:1: ( ( rule__HttpGet__ParamsAssignment_6 )* )
            // InternalPartitur.g:1693:2: ( rule__HttpGet__ParamsAssignment_6 )*
            {
             before(grammarAccess.getHttpGetAccess().getParamsAssignment_6()); 
            // InternalPartitur.g:1694:2: ( rule__HttpGet__ParamsAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPartitur.g:1694:3: rule__HttpGet__ParamsAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__HttpGet__ParamsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getHttpGetAccess().getParamsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__6__Impl"


    // $ANTLR start "rule__HttpPost__Group__0"
    // InternalPartitur.g:1703:1: rule__HttpPost__Group__0 : rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1 ;
    public final void rule__HttpPost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1707:1: ( rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1 )
            // InternalPartitur.g:1708:2: rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__HttpPost__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__0"


    // $ANTLR start "rule__HttpPost__Group__0__Impl"
    // InternalPartitur.g:1715:1: rule__HttpPost__Group__0__Impl : ( 'post' ) ;
    public final void rule__HttpPost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1719:1: ( ( 'post' ) )
            // InternalPartitur.g:1720:1: ( 'post' )
            {
            // InternalPartitur.g:1720:1: ( 'post' )
            // InternalPartitur.g:1721:2: 'post'
            {
             before(grammarAccess.getHttpPostAccess().getPostKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHttpPostAccess().getPostKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__0__Impl"


    // $ANTLR start "rule__HttpPost__Group__1"
    // InternalPartitur.g:1730:1: rule__HttpPost__Group__1 : rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2 ;
    public final void rule__HttpPost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1734:1: ( rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2 )
            // InternalPartitur.g:1735:2: rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__HttpPost__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__1"


    // $ANTLR start "rule__HttpPost__Group__1__Impl"
    // InternalPartitur.g:1742:1: rule__HttpPost__Group__1__Impl : ( '(' ) ;
    public final void rule__HttpPost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1746:1: ( ( '(' ) )
            // InternalPartitur.g:1747:1: ( '(' )
            {
            // InternalPartitur.g:1747:1: ( '(' )
            // InternalPartitur.g:1748:2: '('
            {
             before(grammarAccess.getHttpPostAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHttpPostAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__1__Impl"


    // $ANTLR start "rule__HttpPost__Group__2"
    // InternalPartitur.g:1757:1: rule__HttpPost__Group__2 : rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3 ;
    public final void rule__HttpPost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1761:1: ( rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3 )
            // InternalPartitur.g:1762:2: rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__HttpPost__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__2"


    // $ANTLR start "rule__HttpPost__Group__2__Impl"
    // InternalPartitur.g:1769:1: rule__HttpPost__Group__2__Impl : ( ( rule__HttpPost__UrlAssignment_2 ) ) ;
    public final void rule__HttpPost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1773:1: ( ( ( rule__HttpPost__UrlAssignment_2 ) ) )
            // InternalPartitur.g:1774:1: ( ( rule__HttpPost__UrlAssignment_2 ) )
            {
            // InternalPartitur.g:1774:1: ( ( rule__HttpPost__UrlAssignment_2 ) )
            // InternalPartitur.g:1775:2: ( rule__HttpPost__UrlAssignment_2 )
            {
             before(grammarAccess.getHttpPostAccess().getUrlAssignment_2()); 
            // InternalPartitur.g:1776:2: ( rule__HttpPost__UrlAssignment_2 )
            // InternalPartitur.g:1776:3: rule__HttpPost__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HttpPost__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHttpPostAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__2__Impl"


    // $ANTLR start "rule__HttpPost__Group__3"
    // InternalPartitur.g:1784:1: rule__HttpPost__Group__3 : rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4 ;
    public final void rule__HttpPost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1788:1: ( rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4 )
            // InternalPartitur.g:1789:2: rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__HttpPost__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__3"


    // $ANTLR start "rule__HttpPost__Group__3__Impl"
    // InternalPartitur.g:1796:1: rule__HttpPost__Group__3__Impl : ( ')' ) ;
    public final void rule__HttpPost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1800:1: ( ( ')' ) )
            // InternalPartitur.g:1801:1: ( ')' )
            {
            // InternalPartitur.g:1801:1: ( ')' )
            // InternalPartitur.g:1802:2: ')'
            {
             before(grammarAccess.getHttpPostAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHttpPostAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__3__Impl"


    // $ANTLR start "rule__HttpPost__Group__4"
    // InternalPartitur.g:1811:1: rule__HttpPost__Group__4 : rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5 ;
    public final void rule__HttpPost__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1815:1: ( rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5 )
            // InternalPartitur.g:1816:2: rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__HttpPost__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__4"


    // $ANTLR start "rule__HttpPost__Group__4__Impl"
    // InternalPartitur.g:1823:1: rule__HttpPost__Group__4__Impl : ( ( rule__HttpPost__UriVariablesAssignment_4 )? ) ;
    public final void rule__HttpPost__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1827:1: ( ( ( rule__HttpPost__UriVariablesAssignment_4 )? ) )
            // InternalPartitur.g:1828:1: ( ( rule__HttpPost__UriVariablesAssignment_4 )? )
            {
            // InternalPartitur.g:1828:1: ( ( rule__HttpPost__UriVariablesAssignment_4 )? )
            // InternalPartitur.g:1829:2: ( rule__HttpPost__UriVariablesAssignment_4 )?
            {
             before(grammarAccess.getHttpPostAccess().getUriVariablesAssignment_4()); 
            // InternalPartitur.g:1830:2: ( rule__HttpPost__UriVariablesAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPartitur.g:1830:3: rule__HttpPost__UriVariablesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__HttpPost__UriVariablesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPostAccess().getUriVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__4__Impl"


    // $ANTLR start "rule__HttpPost__Group__5"
    // InternalPartitur.g:1838:1: rule__HttpPost__Group__5 : rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6 ;
    public final void rule__HttpPost__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1842:1: ( rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6 )
            // InternalPartitur.g:1843:2: rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__HttpPost__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__5"


    // $ANTLR start "rule__HttpPost__Group__5__Impl"
    // InternalPartitur.g:1850:1: rule__HttpPost__Group__5__Impl : ( ( rule__HttpPost__HeadersAssignment_5 )* ) ;
    public final void rule__HttpPost__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1854:1: ( ( ( rule__HttpPost__HeadersAssignment_5 )* ) )
            // InternalPartitur.g:1855:1: ( ( rule__HttpPost__HeadersAssignment_5 )* )
            {
            // InternalPartitur.g:1855:1: ( ( rule__HttpPost__HeadersAssignment_5 )* )
            // InternalPartitur.g:1856:2: ( rule__HttpPost__HeadersAssignment_5 )*
            {
             before(grammarAccess.getHttpPostAccess().getHeadersAssignment_5()); 
            // InternalPartitur.g:1857:2: ( rule__HttpPost__HeadersAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPartitur.g:1857:3: rule__HttpPost__HeadersAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__HttpPost__HeadersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHttpPostAccess().getHeadersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__5__Impl"


    // $ANTLR start "rule__HttpPost__Group__6"
    // InternalPartitur.g:1865:1: rule__HttpPost__Group__6 : rule__HttpPost__Group__6__Impl ;
    public final void rule__HttpPost__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1869:1: ( rule__HttpPost__Group__6__Impl )
            // InternalPartitur.g:1870:2: rule__HttpPost__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HttpPost__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__6"


    // $ANTLR start "rule__HttpPost__Group__6__Impl"
    // InternalPartitur.g:1876:1: rule__HttpPost__Group__6__Impl : ( ( rule__HttpPost__BodyAssignment_6 )? ) ;
    public final void rule__HttpPost__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1880:1: ( ( ( rule__HttpPost__BodyAssignment_6 )? ) )
            // InternalPartitur.g:1881:1: ( ( rule__HttpPost__BodyAssignment_6 )? )
            {
            // InternalPartitur.g:1881:1: ( ( rule__HttpPost__BodyAssignment_6 )? )
            // InternalPartitur.g:1882:2: ( rule__HttpPost__BodyAssignment_6 )?
            {
             before(grammarAccess.getHttpPostAccess().getBodyAssignment_6()); 
            // InternalPartitur.g:1883:2: ( rule__HttpPost__BodyAssignment_6 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPartitur.g:1883:3: rule__HttpPost__BodyAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__HttpPost__BodyAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPostAccess().getBodyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__6__Impl"


    // $ANTLR start "rule__HttpPut__Group__0"
    // InternalPartitur.g:1892:1: rule__HttpPut__Group__0 : rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1 ;
    public final void rule__HttpPut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1896:1: ( rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1 )
            // InternalPartitur.g:1897:2: rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__HttpPut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__0"


    // $ANTLR start "rule__HttpPut__Group__0__Impl"
    // InternalPartitur.g:1904:1: rule__HttpPut__Group__0__Impl : ( 'put' ) ;
    public final void rule__HttpPut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1908:1: ( ( 'put' ) )
            // InternalPartitur.g:1909:1: ( 'put' )
            {
            // InternalPartitur.g:1909:1: ( 'put' )
            // InternalPartitur.g:1910:2: 'put'
            {
             before(grammarAccess.getHttpPutAccess().getPutKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getHttpPutAccess().getPutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__0__Impl"


    // $ANTLR start "rule__HttpPut__Group__1"
    // InternalPartitur.g:1919:1: rule__HttpPut__Group__1 : rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2 ;
    public final void rule__HttpPut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1923:1: ( rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2 )
            // InternalPartitur.g:1924:2: rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__HttpPut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__1"


    // $ANTLR start "rule__HttpPut__Group__1__Impl"
    // InternalPartitur.g:1931:1: rule__HttpPut__Group__1__Impl : ( '(' ) ;
    public final void rule__HttpPut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1935:1: ( ( '(' ) )
            // InternalPartitur.g:1936:1: ( '(' )
            {
            // InternalPartitur.g:1936:1: ( '(' )
            // InternalPartitur.g:1937:2: '('
            {
             before(grammarAccess.getHttpPutAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHttpPutAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__1__Impl"


    // $ANTLR start "rule__HttpPut__Group__2"
    // InternalPartitur.g:1946:1: rule__HttpPut__Group__2 : rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3 ;
    public final void rule__HttpPut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1950:1: ( rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3 )
            // InternalPartitur.g:1951:2: rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__HttpPut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__2"


    // $ANTLR start "rule__HttpPut__Group__2__Impl"
    // InternalPartitur.g:1958:1: rule__HttpPut__Group__2__Impl : ( ( rule__HttpPut__UrlAssignment_2 ) ) ;
    public final void rule__HttpPut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1962:1: ( ( ( rule__HttpPut__UrlAssignment_2 ) ) )
            // InternalPartitur.g:1963:1: ( ( rule__HttpPut__UrlAssignment_2 ) )
            {
            // InternalPartitur.g:1963:1: ( ( rule__HttpPut__UrlAssignment_2 ) )
            // InternalPartitur.g:1964:2: ( rule__HttpPut__UrlAssignment_2 )
            {
             before(grammarAccess.getHttpPutAccess().getUrlAssignment_2()); 
            // InternalPartitur.g:1965:2: ( rule__HttpPut__UrlAssignment_2 )
            // InternalPartitur.g:1965:3: rule__HttpPut__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HttpPut__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHttpPutAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__2__Impl"


    // $ANTLR start "rule__HttpPut__Group__3"
    // InternalPartitur.g:1973:1: rule__HttpPut__Group__3 : rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4 ;
    public final void rule__HttpPut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1977:1: ( rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4 )
            // InternalPartitur.g:1978:2: rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__HttpPut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__3"


    // $ANTLR start "rule__HttpPut__Group__3__Impl"
    // InternalPartitur.g:1985:1: rule__HttpPut__Group__3__Impl : ( ')' ) ;
    public final void rule__HttpPut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:1989:1: ( ( ')' ) )
            // InternalPartitur.g:1990:1: ( ')' )
            {
            // InternalPartitur.g:1990:1: ( ')' )
            // InternalPartitur.g:1991:2: ')'
            {
             before(grammarAccess.getHttpPutAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHttpPutAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__3__Impl"


    // $ANTLR start "rule__HttpPut__Group__4"
    // InternalPartitur.g:2000:1: rule__HttpPut__Group__4 : rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5 ;
    public final void rule__HttpPut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2004:1: ( rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5 )
            // InternalPartitur.g:2005:2: rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__HttpPut__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__4"


    // $ANTLR start "rule__HttpPut__Group__4__Impl"
    // InternalPartitur.g:2012:1: rule__HttpPut__Group__4__Impl : ( ( rule__HttpPut__UriVariablesAssignment_4 )? ) ;
    public final void rule__HttpPut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2016:1: ( ( ( rule__HttpPut__UriVariablesAssignment_4 )? ) )
            // InternalPartitur.g:2017:1: ( ( rule__HttpPut__UriVariablesAssignment_4 )? )
            {
            // InternalPartitur.g:2017:1: ( ( rule__HttpPut__UriVariablesAssignment_4 )? )
            // InternalPartitur.g:2018:2: ( rule__HttpPut__UriVariablesAssignment_4 )?
            {
             before(grammarAccess.getHttpPutAccess().getUriVariablesAssignment_4()); 
            // InternalPartitur.g:2019:2: ( rule__HttpPut__UriVariablesAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPartitur.g:2019:3: rule__HttpPut__UriVariablesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__HttpPut__UriVariablesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPutAccess().getUriVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__4__Impl"


    // $ANTLR start "rule__HttpPut__Group__5"
    // InternalPartitur.g:2027:1: rule__HttpPut__Group__5 : rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6 ;
    public final void rule__HttpPut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2031:1: ( rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6 )
            // InternalPartitur.g:2032:2: rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__HttpPut__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__5"


    // $ANTLR start "rule__HttpPut__Group__5__Impl"
    // InternalPartitur.g:2039:1: rule__HttpPut__Group__5__Impl : ( ( rule__HttpPut__HeadersAssignment_5 )* ) ;
    public final void rule__HttpPut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2043:1: ( ( ( rule__HttpPut__HeadersAssignment_5 )* ) )
            // InternalPartitur.g:2044:1: ( ( rule__HttpPut__HeadersAssignment_5 )* )
            {
            // InternalPartitur.g:2044:1: ( ( rule__HttpPut__HeadersAssignment_5 )* )
            // InternalPartitur.g:2045:2: ( rule__HttpPut__HeadersAssignment_5 )*
            {
             before(grammarAccess.getHttpPutAccess().getHeadersAssignment_5()); 
            // InternalPartitur.g:2046:2: ( rule__HttpPut__HeadersAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPartitur.g:2046:3: rule__HttpPut__HeadersAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__HttpPut__HeadersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getHttpPutAccess().getHeadersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__5__Impl"


    // $ANTLR start "rule__HttpPut__Group__6"
    // InternalPartitur.g:2054:1: rule__HttpPut__Group__6 : rule__HttpPut__Group__6__Impl ;
    public final void rule__HttpPut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2058:1: ( rule__HttpPut__Group__6__Impl )
            // InternalPartitur.g:2059:2: rule__HttpPut__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HttpPut__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__6"


    // $ANTLR start "rule__HttpPut__Group__6__Impl"
    // InternalPartitur.g:2065:1: rule__HttpPut__Group__6__Impl : ( ( rule__HttpPut__BodyAssignment_6 )? ) ;
    public final void rule__HttpPut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2069:1: ( ( ( rule__HttpPut__BodyAssignment_6 )? ) )
            // InternalPartitur.g:2070:1: ( ( rule__HttpPut__BodyAssignment_6 )? )
            {
            // InternalPartitur.g:2070:1: ( ( rule__HttpPut__BodyAssignment_6 )? )
            // InternalPartitur.g:2071:2: ( rule__HttpPut__BodyAssignment_6 )?
            {
             before(grammarAccess.getHttpPutAccess().getBodyAssignment_6()); 
            // InternalPartitur.g:2072:2: ( rule__HttpPut__BodyAssignment_6 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPartitur.g:2072:3: rule__HttpPut__BodyAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__HttpPut__BodyAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPutAccess().getBodyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__6__Impl"


    // $ANTLR start "rule__HttpDelete__Group__0"
    // InternalPartitur.g:2081:1: rule__HttpDelete__Group__0 : rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1 ;
    public final void rule__HttpDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2085:1: ( rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1 )
            // InternalPartitur.g:2086:2: rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__HttpDelete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpDelete__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__0"


    // $ANTLR start "rule__HttpDelete__Group__0__Impl"
    // InternalPartitur.g:2093:1: rule__HttpDelete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__HttpDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2097:1: ( ( 'delete' ) )
            // InternalPartitur.g:2098:1: ( 'delete' )
            {
            // InternalPartitur.g:2098:1: ( 'delete' )
            // InternalPartitur.g:2099:2: 'delete'
            {
             before(grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__0__Impl"


    // $ANTLR start "rule__HttpDelete__Group__1"
    // InternalPartitur.g:2108:1: rule__HttpDelete__Group__1 : rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2 ;
    public final void rule__HttpDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2112:1: ( rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2 )
            // InternalPartitur.g:2113:2: rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__HttpDelete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpDelete__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__1"


    // $ANTLR start "rule__HttpDelete__Group__1__Impl"
    // InternalPartitur.g:2120:1: rule__HttpDelete__Group__1__Impl : ( '(' ) ;
    public final void rule__HttpDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2124:1: ( ( '(' ) )
            // InternalPartitur.g:2125:1: ( '(' )
            {
            // InternalPartitur.g:2125:1: ( '(' )
            // InternalPartitur.g:2126:2: '('
            {
             before(grammarAccess.getHttpDeleteAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHttpDeleteAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__1__Impl"


    // $ANTLR start "rule__HttpDelete__Group__2"
    // InternalPartitur.g:2135:1: rule__HttpDelete__Group__2 : rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3 ;
    public final void rule__HttpDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2139:1: ( rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3 )
            // InternalPartitur.g:2140:2: rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__HttpDelete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpDelete__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__2"


    // $ANTLR start "rule__HttpDelete__Group__2__Impl"
    // InternalPartitur.g:2147:1: rule__HttpDelete__Group__2__Impl : ( ( rule__HttpDelete__UrlAssignment_2 ) ) ;
    public final void rule__HttpDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2151:1: ( ( ( rule__HttpDelete__UrlAssignment_2 ) ) )
            // InternalPartitur.g:2152:1: ( ( rule__HttpDelete__UrlAssignment_2 ) )
            {
            // InternalPartitur.g:2152:1: ( ( rule__HttpDelete__UrlAssignment_2 ) )
            // InternalPartitur.g:2153:2: ( rule__HttpDelete__UrlAssignment_2 )
            {
             before(grammarAccess.getHttpDeleteAccess().getUrlAssignment_2()); 
            // InternalPartitur.g:2154:2: ( rule__HttpDelete__UrlAssignment_2 )
            // InternalPartitur.g:2154:3: rule__HttpDelete__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HttpDelete__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHttpDeleteAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__2__Impl"


    // $ANTLR start "rule__HttpDelete__Group__3"
    // InternalPartitur.g:2162:1: rule__HttpDelete__Group__3 : rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4 ;
    public final void rule__HttpDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2166:1: ( rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4 )
            // InternalPartitur.g:2167:2: rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__HttpDelete__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpDelete__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__3"


    // $ANTLR start "rule__HttpDelete__Group__3__Impl"
    // InternalPartitur.g:2174:1: rule__HttpDelete__Group__3__Impl : ( ')' ) ;
    public final void rule__HttpDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2178:1: ( ( ')' ) )
            // InternalPartitur.g:2179:1: ( ')' )
            {
            // InternalPartitur.g:2179:1: ( ')' )
            // InternalPartitur.g:2180:2: ')'
            {
             before(grammarAccess.getHttpDeleteAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHttpDeleteAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__3__Impl"


    // $ANTLR start "rule__HttpDelete__Group__4"
    // InternalPartitur.g:2189:1: rule__HttpDelete__Group__4 : rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5 ;
    public final void rule__HttpDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2193:1: ( rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5 )
            // InternalPartitur.g:2194:2: rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__HttpDelete__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpDelete__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__4"


    // $ANTLR start "rule__HttpDelete__Group__4__Impl"
    // InternalPartitur.g:2201:1: rule__HttpDelete__Group__4__Impl : ( ( rule__HttpDelete__UriVariablesAssignment_4 )? ) ;
    public final void rule__HttpDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2205:1: ( ( ( rule__HttpDelete__UriVariablesAssignment_4 )? ) )
            // InternalPartitur.g:2206:1: ( ( rule__HttpDelete__UriVariablesAssignment_4 )? )
            {
            // InternalPartitur.g:2206:1: ( ( rule__HttpDelete__UriVariablesAssignment_4 )? )
            // InternalPartitur.g:2207:2: ( rule__HttpDelete__UriVariablesAssignment_4 )?
            {
             before(grammarAccess.getHttpDeleteAccess().getUriVariablesAssignment_4()); 
            // InternalPartitur.g:2208:2: ( rule__HttpDelete__UriVariablesAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPartitur.g:2208:3: rule__HttpDelete__UriVariablesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__HttpDelete__UriVariablesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpDeleteAccess().getUriVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__4__Impl"


    // $ANTLR start "rule__HttpDelete__Group__5"
    // InternalPartitur.g:2216:1: rule__HttpDelete__Group__5 : rule__HttpDelete__Group__5__Impl ;
    public final void rule__HttpDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2220:1: ( rule__HttpDelete__Group__5__Impl )
            // InternalPartitur.g:2221:2: rule__HttpDelete__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HttpDelete__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__5"


    // $ANTLR start "rule__HttpDelete__Group__5__Impl"
    // InternalPartitur.g:2227:1: rule__HttpDelete__Group__5__Impl : ( ( rule__HttpDelete__HeadersAssignment_5 )* ) ;
    public final void rule__HttpDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2231:1: ( ( ( rule__HttpDelete__HeadersAssignment_5 )* ) )
            // InternalPartitur.g:2232:1: ( ( rule__HttpDelete__HeadersAssignment_5 )* )
            {
            // InternalPartitur.g:2232:1: ( ( rule__HttpDelete__HeadersAssignment_5 )* )
            // InternalPartitur.g:2233:2: ( rule__HttpDelete__HeadersAssignment_5 )*
            {
             before(grammarAccess.getHttpDeleteAccess().getHeadersAssignment_5()); 
            // InternalPartitur.g:2234:2: ( rule__HttpDelete__HeadersAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPartitur.g:2234:3: rule__HttpDelete__HeadersAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__HttpDelete__HeadersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getHttpDeleteAccess().getHeadersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__5__Impl"


    // $ANTLR start "rule__HttpHeader__Group__0"
    // InternalPartitur.g:2243:1: rule__HttpHeader__Group__0 : rule__HttpHeader__Group__0__Impl rule__HttpHeader__Group__1 ;
    public final void rule__HttpHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2247:1: ( rule__HttpHeader__Group__0__Impl rule__HttpHeader__Group__1 )
            // InternalPartitur.g:2248:2: rule__HttpHeader__Group__0__Impl rule__HttpHeader__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__HttpHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__0"


    // $ANTLR start "rule__HttpHeader__Group__0__Impl"
    // InternalPartitur.g:2255:1: rule__HttpHeader__Group__0__Impl : ( '.header(' ) ;
    public final void rule__HttpHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2259:1: ( ( '.header(' ) )
            // InternalPartitur.g:2260:1: ( '.header(' )
            {
            // InternalPartitur.g:2260:1: ( '.header(' )
            // InternalPartitur.g:2261:2: '.header('
            {
             before(grammarAccess.getHttpHeaderAccess().getHeaderKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderAccess().getHeaderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__0__Impl"


    // $ANTLR start "rule__HttpHeader__Group__1"
    // InternalPartitur.g:2270:1: rule__HttpHeader__Group__1 : rule__HttpHeader__Group__1__Impl rule__HttpHeader__Group__2 ;
    public final void rule__HttpHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2274:1: ( rule__HttpHeader__Group__1__Impl rule__HttpHeader__Group__2 )
            // InternalPartitur.g:2275:2: rule__HttpHeader__Group__1__Impl rule__HttpHeader__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__HttpHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__1"


    // $ANTLR start "rule__HttpHeader__Group__1__Impl"
    // InternalPartitur.g:2282:1: rule__HttpHeader__Group__1__Impl : ( ( rule__HttpHeader__NameAssignment_1 ) ) ;
    public final void rule__HttpHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2286:1: ( ( ( rule__HttpHeader__NameAssignment_1 ) ) )
            // InternalPartitur.g:2287:1: ( ( rule__HttpHeader__NameAssignment_1 ) )
            {
            // InternalPartitur.g:2287:1: ( ( rule__HttpHeader__NameAssignment_1 ) )
            // InternalPartitur.g:2288:2: ( rule__HttpHeader__NameAssignment_1 )
            {
             before(grammarAccess.getHttpHeaderAccess().getNameAssignment_1()); 
            // InternalPartitur.g:2289:2: ( rule__HttpHeader__NameAssignment_1 )
            // InternalPartitur.g:2289:3: rule__HttpHeader__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeader__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__1__Impl"


    // $ANTLR start "rule__HttpHeader__Group__2"
    // InternalPartitur.g:2297:1: rule__HttpHeader__Group__2 : rule__HttpHeader__Group__2__Impl rule__HttpHeader__Group__3 ;
    public final void rule__HttpHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2301:1: ( rule__HttpHeader__Group__2__Impl rule__HttpHeader__Group__3 )
            // InternalPartitur.g:2302:2: rule__HttpHeader__Group__2__Impl rule__HttpHeader__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__HttpHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__2"


    // $ANTLR start "rule__HttpHeader__Group__2__Impl"
    // InternalPartitur.g:2309:1: rule__HttpHeader__Group__2__Impl : ( ',' ) ;
    public final void rule__HttpHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2313:1: ( ( ',' ) )
            // InternalPartitur.g:2314:1: ( ',' )
            {
            // InternalPartitur.g:2314:1: ( ',' )
            // InternalPartitur.g:2315:2: ','
            {
             before(grammarAccess.getHttpHeaderAccess().getCommaKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__2__Impl"


    // $ANTLR start "rule__HttpHeader__Group__3"
    // InternalPartitur.g:2324:1: rule__HttpHeader__Group__3 : rule__HttpHeader__Group__3__Impl rule__HttpHeader__Group__4 ;
    public final void rule__HttpHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2328:1: ( rule__HttpHeader__Group__3__Impl rule__HttpHeader__Group__4 )
            // InternalPartitur.g:2329:2: rule__HttpHeader__Group__3__Impl rule__HttpHeader__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__HttpHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpHeader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__3"


    // $ANTLR start "rule__HttpHeader__Group__3__Impl"
    // InternalPartitur.g:2336:1: rule__HttpHeader__Group__3__Impl : ( ( rule__HttpHeader__ValueAssignment_3 ) ) ;
    public final void rule__HttpHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2340:1: ( ( ( rule__HttpHeader__ValueAssignment_3 ) ) )
            // InternalPartitur.g:2341:1: ( ( rule__HttpHeader__ValueAssignment_3 ) )
            {
            // InternalPartitur.g:2341:1: ( ( rule__HttpHeader__ValueAssignment_3 ) )
            // InternalPartitur.g:2342:2: ( rule__HttpHeader__ValueAssignment_3 )
            {
             before(grammarAccess.getHttpHeaderAccess().getValueAssignment_3()); 
            // InternalPartitur.g:2343:2: ( rule__HttpHeader__ValueAssignment_3 )
            // InternalPartitur.g:2343:3: rule__HttpHeader__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeader__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHttpHeaderAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__3__Impl"


    // $ANTLR start "rule__HttpHeader__Group__4"
    // InternalPartitur.g:2351:1: rule__HttpHeader__Group__4 : rule__HttpHeader__Group__4__Impl ;
    public final void rule__HttpHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2355:1: ( rule__HttpHeader__Group__4__Impl )
            // InternalPartitur.g:2356:2: rule__HttpHeader__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HttpHeader__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__4"


    // $ANTLR start "rule__HttpHeader__Group__4__Impl"
    // InternalPartitur.g:2362:1: rule__HttpHeader__Group__4__Impl : ( ')' ) ;
    public final void rule__HttpHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2366:1: ( ( ')' ) )
            // InternalPartitur.g:2367:1: ( ')' )
            {
            // InternalPartitur.g:2367:1: ( ')' )
            // InternalPartitur.g:2368:2: ')'
            {
             before(grammarAccess.getHttpHeaderAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__Group__4__Impl"


    // $ANTLR start "rule__UriVariables__Group__0"
    // InternalPartitur.g:2378:1: rule__UriVariables__Group__0 : rule__UriVariables__Group__0__Impl rule__UriVariables__Group__1 ;
    public final void rule__UriVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2382:1: ( rule__UriVariables__Group__0__Impl rule__UriVariables__Group__1 )
            // InternalPartitur.g:2383:2: rule__UriVariables__Group__0__Impl rule__UriVariables__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__UriVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UriVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__0"


    // $ANTLR start "rule__UriVariables__Group__0__Impl"
    // InternalPartitur.g:2390:1: rule__UriVariables__Group__0__Impl : ( '.uriVariables(' ) ;
    public final void rule__UriVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2394:1: ( ( '.uriVariables(' ) )
            // InternalPartitur.g:2395:1: ( '.uriVariables(' )
            {
            // InternalPartitur.g:2395:1: ( '.uriVariables(' )
            // InternalPartitur.g:2396:2: '.uriVariables('
            {
             before(grammarAccess.getUriVariablesAccess().getUriVariablesKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getUriVariablesAccess().getUriVariablesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__0__Impl"


    // $ANTLR start "rule__UriVariables__Group__1"
    // InternalPartitur.g:2405:1: rule__UriVariables__Group__1 : rule__UriVariables__Group__1__Impl rule__UriVariables__Group__2 ;
    public final void rule__UriVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2409:1: ( rule__UriVariables__Group__1__Impl rule__UriVariables__Group__2 )
            // InternalPartitur.g:2410:2: rule__UriVariables__Group__1__Impl rule__UriVariables__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__UriVariables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UriVariables__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__1"


    // $ANTLR start "rule__UriVariables__Group__1__Impl"
    // InternalPartitur.g:2417:1: rule__UriVariables__Group__1__Impl : ( ( rule__UriVariables__ValuesAssignment_1 ) ) ;
    public final void rule__UriVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2421:1: ( ( ( rule__UriVariables__ValuesAssignment_1 ) ) )
            // InternalPartitur.g:2422:1: ( ( rule__UriVariables__ValuesAssignment_1 ) )
            {
            // InternalPartitur.g:2422:1: ( ( rule__UriVariables__ValuesAssignment_1 ) )
            // InternalPartitur.g:2423:2: ( rule__UriVariables__ValuesAssignment_1 )
            {
             before(grammarAccess.getUriVariablesAccess().getValuesAssignment_1()); 
            // InternalPartitur.g:2424:2: ( rule__UriVariables__ValuesAssignment_1 )
            // InternalPartitur.g:2424:3: rule__UriVariables__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UriVariables__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUriVariablesAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__1__Impl"


    // $ANTLR start "rule__UriVariables__Group__2"
    // InternalPartitur.g:2432:1: rule__UriVariables__Group__2 : rule__UriVariables__Group__2__Impl rule__UriVariables__Group__3 ;
    public final void rule__UriVariables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2436:1: ( rule__UriVariables__Group__2__Impl rule__UriVariables__Group__3 )
            // InternalPartitur.g:2437:2: rule__UriVariables__Group__2__Impl rule__UriVariables__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__UriVariables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UriVariables__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__2"


    // $ANTLR start "rule__UriVariables__Group__2__Impl"
    // InternalPartitur.g:2444:1: rule__UriVariables__Group__2__Impl : ( ( rule__UriVariables__Group_2__0 )* ) ;
    public final void rule__UriVariables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2448:1: ( ( ( rule__UriVariables__Group_2__0 )* ) )
            // InternalPartitur.g:2449:1: ( ( rule__UriVariables__Group_2__0 )* )
            {
            // InternalPartitur.g:2449:1: ( ( rule__UriVariables__Group_2__0 )* )
            // InternalPartitur.g:2450:2: ( rule__UriVariables__Group_2__0 )*
            {
             before(grammarAccess.getUriVariablesAccess().getGroup_2()); 
            // InternalPartitur.g:2451:2: ( rule__UriVariables__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPartitur.g:2451:3: rule__UriVariables__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UriVariables__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getUriVariablesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__2__Impl"


    // $ANTLR start "rule__UriVariables__Group__3"
    // InternalPartitur.g:2459:1: rule__UriVariables__Group__3 : rule__UriVariables__Group__3__Impl ;
    public final void rule__UriVariables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2463:1: ( rule__UriVariables__Group__3__Impl )
            // InternalPartitur.g:2464:2: rule__UriVariables__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UriVariables__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__3"


    // $ANTLR start "rule__UriVariables__Group__3__Impl"
    // InternalPartitur.g:2470:1: rule__UriVariables__Group__3__Impl : ( ')' ) ;
    public final void rule__UriVariables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2474:1: ( ( ')' ) )
            // InternalPartitur.g:2475:1: ( ')' )
            {
            // InternalPartitur.g:2475:1: ( ')' )
            // InternalPartitur.g:2476:2: ')'
            {
             before(grammarAccess.getUriVariablesAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUriVariablesAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group__3__Impl"


    // $ANTLR start "rule__UriVariables__Group_2__0"
    // InternalPartitur.g:2486:1: rule__UriVariables__Group_2__0 : rule__UriVariables__Group_2__0__Impl rule__UriVariables__Group_2__1 ;
    public final void rule__UriVariables__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2490:1: ( rule__UriVariables__Group_2__0__Impl rule__UriVariables__Group_2__1 )
            // InternalPartitur.g:2491:2: rule__UriVariables__Group_2__0__Impl rule__UriVariables__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__UriVariables__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UriVariables__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group_2__0"


    // $ANTLR start "rule__UriVariables__Group_2__0__Impl"
    // InternalPartitur.g:2498:1: rule__UriVariables__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UriVariables__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2502:1: ( ( ',' ) )
            // InternalPartitur.g:2503:1: ( ',' )
            {
            // InternalPartitur.g:2503:1: ( ',' )
            // InternalPartitur.g:2504:2: ','
            {
             before(grammarAccess.getUriVariablesAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUriVariablesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group_2__0__Impl"


    // $ANTLR start "rule__UriVariables__Group_2__1"
    // InternalPartitur.g:2513:1: rule__UriVariables__Group_2__1 : rule__UriVariables__Group_2__1__Impl ;
    public final void rule__UriVariables__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2517:1: ( rule__UriVariables__Group_2__1__Impl )
            // InternalPartitur.g:2518:2: rule__UriVariables__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UriVariables__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group_2__1"


    // $ANTLR start "rule__UriVariables__Group_2__1__Impl"
    // InternalPartitur.g:2524:1: rule__UriVariables__Group_2__1__Impl : ( ( rule__UriVariables__ValuesAssignment_2_1 ) ) ;
    public final void rule__UriVariables__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2528:1: ( ( ( rule__UriVariables__ValuesAssignment_2_1 ) ) )
            // InternalPartitur.g:2529:1: ( ( rule__UriVariables__ValuesAssignment_2_1 ) )
            {
            // InternalPartitur.g:2529:1: ( ( rule__UriVariables__ValuesAssignment_2_1 ) )
            // InternalPartitur.g:2530:2: ( rule__UriVariables__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getUriVariablesAccess().getValuesAssignment_2_1()); 
            // InternalPartitur.g:2531:2: ( rule__UriVariables__ValuesAssignment_2_1 )
            // InternalPartitur.g:2531:3: rule__UriVariables__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UriVariables__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUriVariablesAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__Group_2__1__Impl"


    // $ANTLR start "rule__QueryParam__Group__0"
    // InternalPartitur.g:2540:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2544:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalPartitur.g:2545:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__QueryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0"


    // $ANTLR start "rule__QueryParam__Group__0__Impl"
    // InternalPartitur.g:2552:1: rule__QueryParam__Group__0__Impl : ( '.queryParams(' ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2556:1: ( ( '.queryParams(' ) )
            // InternalPartitur.g:2557:1: ( '.queryParams(' )
            {
            // InternalPartitur.g:2557:1: ( '.queryParams(' )
            // InternalPartitur.g:2558:2: '.queryParams('
            {
             before(grammarAccess.getQueryParamAccess().getQueryParamsKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getQueryParamsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0__Impl"


    // $ANTLR start "rule__QueryParam__Group__1"
    // InternalPartitur.g:2567:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2571:1: ( rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 )
            // InternalPartitur.g:2572:2: rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__QueryParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1"


    // $ANTLR start "rule__QueryParam__Group__1__Impl"
    // InternalPartitur.g:2579:1: rule__QueryParam__Group__1__Impl : ( ( rule__QueryParam__NameAssignment_1 ) ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2583:1: ( ( ( rule__QueryParam__NameAssignment_1 ) ) )
            // InternalPartitur.g:2584:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            {
            // InternalPartitur.g:2584:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            // InternalPartitur.g:2585:2: ( rule__QueryParam__NameAssignment_1 )
            {
             before(grammarAccess.getQueryParamAccess().getNameAssignment_1()); 
            // InternalPartitur.g:2586:2: ( rule__QueryParam__NameAssignment_1 )
            // InternalPartitur.g:2586:3: rule__QueryParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1__Impl"


    // $ANTLR start "rule__QueryParam__Group__2"
    // InternalPartitur.g:2594:1: rule__QueryParam__Group__2 : rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3 ;
    public final void rule__QueryParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2598:1: ( rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3 )
            // InternalPartitur.g:2599:2: rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__QueryParam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__2"


    // $ANTLR start "rule__QueryParam__Group__2__Impl"
    // InternalPartitur.g:2606:1: rule__QueryParam__Group__2__Impl : ( ',' ) ;
    public final void rule__QueryParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2610:1: ( ( ',' ) )
            // InternalPartitur.g:2611:1: ( ',' )
            {
            // InternalPartitur.g:2611:1: ( ',' )
            // InternalPartitur.g:2612:2: ','
            {
             before(grammarAccess.getQueryParamAccess().getCommaKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__2__Impl"


    // $ANTLR start "rule__QueryParam__Group__3"
    // InternalPartitur.g:2621:1: rule__QueryParam__Group__3 : rule__QueryParam__Group__3__Impl rule__QueryParam__Group__4 ;
    public final void rule__QueryParam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2625:1: ( rule__QueryParam__Group__3__Impl rule__QueryParam__Group__4 )
            // InternalPartitur.g:2626:2: rule__QueryParam__Group__3__Impl rule__QueryParam__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__QueryParam__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__3"


    // $ANTLR start "rule__QueryParam__Group__3__Impl"
    // InternalPartitur.g:2633:1: rule__QueryParam__Group__3__Impl : ( ( rule__QueryParam__ValueAssignment_3 ) ) ;
    public final void rule__QueryParam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2637:1: ( ( ( rule__QueryParam__ValueAssignment_3 ) ) )
            // InternalPartitur.g:2638:1: ( ( rule__QueryParam__ValueAssignment_3 ) )
            {
            // InternalPartitur.g:2638:1: ( ( rule__QueryParam__ValueAssignment_3 ) )
            // InternalPartitur.g:2639:2: ( rule__QueryParam__ValueAssignment_3 )
            {
             before(grammarAccess.getQueryParamAccess().getValueAssignment_3()); 
            // InternalPartitur.g:2640:2: ( rule__QueryParam__ValueAssignment_3 )
            // InternalPartitur.g:2640:3: rule__QueryParam__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__3__Impl"


    // $ANTLR start "rule__QueryParam__Group__4"
    // InternalPartitur.g:2648:1: rule__QueryParam__Group__4 : rule__QueryParam__Group__4__Impl ;
    public final void rule__QueryParam__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2652:1: ( rule__QueryParam__Group__4__Impl )
            // InternalPartitur.g:2653:2: rule__QueryParam__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__4"


    // $ANTLR start "rule__QueryParam__Group__4__Impl"
    // InternalPartitur.g:2659:1: rule__QueryParam__Group__4__Impl : ( ')' ) ;
    public final void rule__QueryParam__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2663:1: ( ( ')' ) )
            // InternalPartitur.g:2664:1: ( ')' )
            {
            // InternalPartitur.g:2664:1: ( ')' )
            // InternalPartitur.g:2665:2: ')'
            {
             before(grammarAccess.getQueryParamAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__4__Impl"


    // $ANTLR start "rule__HttpBody__Group__0"
    // InternalPartitur.g:2675:1: rule__HttpBody__Group__0 : rule__HttpBody__Group__0__Impl rule__HttpBody__Group__1 ;
    public final void rule__HttpBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2679:1: ( rule__HttpBody__Group__0__Impl rule__HttpBody__Group__1 )
            // InternalPartitur.g:2680:2: rule__HttpBody__Group__0__Impl rule__HttpBody__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__HttpBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpBody__Group__0"


    // $ANTLR start "rule__HttpBody__Group__0__Impl"
    // InternalPartitur.g:2687:1: rule__HttpBody__Group__0__Impl : ( '.body(' ) ;
    public final void rule__HttpBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2691:1: ( ( '.body(' ) )
            // InternalPartitur.g:2692:1: ( '.body(' )
            {
            // InternalPartitur.g:2692:1: ( '.body(' )
            // InternalPartitur.g:2693:2: '.body('
            {
             before(grammarAccess.getHttpBodyAccess().getBodyKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getHttpBodyAccess().getBodyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpBody__Group__0__Impl"


    // $ANTLR start "rule__HttpBody__Group__1"
    // InternalPartitur.g:2702:1: rule__HttpBody__Group__1 : rule__HttpBody__Group__1__Impl rule__HttpBody__Group__2 ;
    public final void rule__HttpBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2706:1: ( rule__HttpBody__Group__1__Impl rule__HttpBody__Group__2 )
            // InternalPartitur.g:2707:2: rule__HttpBody__Group__1__Impl rule__HttpBody__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__HttpBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HttpBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpBody__Group__1"


    // $ANTLR start "rule__HttpBody__Group__1__Impl"
    // InternalPartitur.g:2714:1: rule__HttpBody__Group__1__Impl : ( ( rule__HttpBody__ValueAssignment_1 ) ) ;
    public final void rule__HttpBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2718:1: ( ( ( rule__HttpBody__ValueAssignment_1 ) ) )
            // InternalPartitur.g:2719:1: ( ( rule__HttpBody__ValueAssignment_1 ) )
            {
            // InternalPartitur.g:2719:1: ( ( rule__HttpBody__ValueAssignment_1 ) )
            // InternalPartitur.g:2720:2: ( rule__HttpBody__ValueAssignment_1 )
            {
             before(grammarAccess.getHttpBodyAccess().getValueAssignment_1()); 
            // InternalPartitur.g:2721:2: ( rule__HttpBody__ValueAssignment_1 )
            // InternalPartitur.g:2721:3: rule__HttpBody__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HttpBody__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpBodyAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpBody__Group__1__Impl"


    // $ANTLR start "rule__HttpBody__Group__2"
    // InternalPartitur.g:2729:1: rule__HttpBody__Group__2 : rule__HttpBody__Group__2__Impl ;
    public final void rule__HttpBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2733:1: ( rule__HttpBody__Group__2__Impl )
            // InternalPartitur.g:2734:2: rule__HttpBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HttpBody__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpBody__Group__2"


    // $ANTLR start "rule__HttpBody__Group__2__Impl"
    // InternalPartitur.g:2740:1: rule__HttpBody__Group__2__Impl : ( ')' ) ;
    public final void rule__HttpBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2744:1: ( ( ')' ) )
            // InternalPartitur.g:2745:1: ( ')' )
            {
            // InternalPartitur.g:2745:1: ( ')' )
            // InternalPartitur.g:2746:2: ')'
            {
             before(grammarAccess.getHttpBodyAccess().getRightParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHttpBodyAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpBody__Group__2__Impl"


    // $ANTLR start "rule__PartiturWorkflow__NameAssignment_1"
    // InternalPartitur.g:2756:1: rule__PartiturWorkflow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PartiturWorkflow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2760:1: ( ( RULE_ID ) )
            // InternalPartitur.g:2761:2: ( RULE_ID )
            {
            // InternalPartitur.g:2761:2: ( RULE_ID )
            // InternalPartitur.g:2762:3: RULE_ID
            {
             before(grammarAccess.getPartiturWorkflowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartiturWorkflowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__NameAssignment_1"


    // $ANTLR start "rule__PartiturWorkflow__TasksAssignment_3"
    // InternalPartitur.g:2771:1: rule__PartiturWorkflow__TasksAssignment_3 : ( rulePartiturTask ) ;
    public final void rule__PartiturWorkflow__TasksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2775:1: ( ( rulePartiturTask ) )
            // InternalPartitur.g:2776:2: ( rulePartiturTask )
            {
            // InternalPartitur.g:2776:2: ( rulePartiturTask )
            // InternalPartitur.g:2777:3: rulePartiturTask
            {
             before(grammarAccess.getPartiturWorkflowAccess().getTasksPartiturTaskParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturTask();

            state._fsp--;

             after(grammarAccess.getPartiturWorkflowAccess().getTasksPartiturTaskParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__TasksAssignment_3"


    // $ANTLR start "rule__PartiturWorkflow__HandlersAssignment_4"
    // InternalPartitur.g:2786:1: rule__PartiturWorkflow__HandlersAssignment_4 : ( rulePartiturHandler ) ;
    public final void rule__PartiturWorkflow__HandlersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2790:1: ( ( rulePartiturHandler ) )
            // InternalPartitur.g:2791:2: ( rulePartiturHandler )
            {
            // InternalPartitur.g:2791:2: ( rulePartiturHandler )
            // InternalPartitur.g:2792:3: rulePartiturHandler
            {
             before(grammarAccess.getPartiturWorkflowAccess().getHandlersPartiturHandlerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturHandler();

            state._fsp--;

             after(grammarAccess.getPartiturWorkflowAccess().getHandlersPartiturHandlerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturWorkflow__HandlersAssignment_4"


    // $ANTLR start "rule__PartiturTask__NameAssignment_1"
    // InternalPartitur.g:2801:1: rule__PartiturTask__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PartiturTask__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2805:1: ( ( RULE_ID ) )
            // InternalPartitur.g:2806:2: ( RULE_ID )
            {
            // InternalPartitur.g:2806:2: ( RULE_ID )
            // InternalPartitur.g:2807:3: RULE_ID
            {
             before(grammarAccess.getPartiturTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartiturTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__NameAssignment_1"


    // $ANTLR start "rule__PartiturTask__PartiturHttpRequestAssignment_3_0"
    // InternalPartitur.g:2816:1: rule__PartiturTask__PartiturHttpRequestAssignment_3_0 : ( ruleHttpGet ) ;
    public final void rule__PartiturTask__PartiturHttpRequestAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2820:1: ( ( ruleHttpGet ) )
            // InternalPartitur.g:2821:2: ( ruleHttpGet )
            {
            // InternalPartitur.g:2821:2: ( ruleHttpGet )
            // InternalPartitur.g:2822:3: ruleHttpGet
            {
             before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpGetParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpGet();

            state._fsp--;

             after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpGetParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__PartiturHttpRequestAssignment_3_0"


    // $ANTLR start "rule__PartiturTask__PartiturHttpRequestAssignment_3_1"
    // InternalPartitur.g:2831:1: rule__PartiturTask__PartiturHttpRequestAssignment_3_1 : ( ruleHttpPost ) ;
    public final void rule__PartiturTask__PartiturHttpRequestAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2835:1: ( ( ruleHttpPost ) )
            // InternalPartitur.g:2836:2: ( ruleHttpPost )
            {
            // InternalPartitur.g:2836:2: ( ruleHttpPost )
            // InternalPartitur.g:2837:3: ruleHttpPost
            {
             before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPostParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpPost();

            state._fsp--;

             after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPostParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__PartiturHttpRequestAssignment_3_1"


    // $ANTLR start "rule__PartiturTask__PartiturHttpRequestAssignment_3_2"
    // InternalPartitur.g:2846:1: rule__PartiturTask__PartiturHttpRequestAssignment_3_2 : ( ruleHttpPut ) ;
    public final void rule__PartiturTask__PartiturHttpRequestAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2850:1: ( ( ruleHttpPut ) )
            // InternalPartitur.g:2851:2: ( ruleHttpPut )
            {
            // InternalPartitur.g:2851:2: ( ruleHttpPut )
            // InternalPartitur.g:2852:3: ruleHttpPut
            {
             before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPutParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpPut();

            state._fsp--;

             after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpPutParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__PartiturHttpRequestAssignment_3_2"


    // $ANTLR start "rule__PartiturTask__PartiturHttpRequestAssignment_3_3"
    // InternalPartitur.g:2861:1: rule__PartiturTask__PartiturHttpRequestAssignment_3_3 : ( ruleHttpDelete ) ;
    public final void rule__PartiturTask__PartiturHttpRequestAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2865:1: ( ( ruleHttpDelete ) )
            // InternalPartitur.g:2866:2: ( ruleHttpDelete )
            {
            // InternalPartitur.g:2866:2: ( ruleHttpDelete )
            // InternalPartitur.g:2867:3: ruleHttpDelete
            {
             before(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpDeleteParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpDelete();

            state._fsp--;

             after(grammarAccess.getPartiturTaskAccess().getPartiturHttpRequestHttpDeleteParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturTask__PartiturHttpRequestAssignment_3_3"


    // $ANTLR start "rule__PartiturHandler__NameAssignment_1"
    // InternalPartitur.g:2876:1: rule__PartiturHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PartiturHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2880:1: ( ( RULE_ID ) )
            // InternalPartitur.g:2881:2: ( RULE_ID )
            {
            // InternalPartitur.g:2881:2: ( RULE_ID )
            // InternalPartitur.g:2882:3: RULE_ID
            {
             before(grammarAccess.getPartiturHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartiturHandlerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__NameAssignment_1"


    // $ANTLR start "rule__PartiturHandler__EventAssignment_4"
    // InternalPartitur.g:2891:1: rule__PartiturHandler__EventAssignment_4 : ( ruleEventType ) ;
    public final void rule__PartiturHandler__EventAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2895:1: ( ( ruleEventType ) )
            // InternalPartitur.g:2896:2: ( ruleEventType )
            {
            // InternalPartitur.g:2896:2: ( ruleEventType )
            // InternalPartitur.g:2897:3: ruleEventType
            {
             before(grammarAccess.getPartiturHandlerAccess().getEventEventTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEventType();

            state._fsp--;

             after(grammarAccess.getPartiturHandlerAccess().getEventEventTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__EventAssignment_4"


    // $ANTLR start "rule__PartiturHandler__ConditionsAssignment_6"
    // InternalPartitur.g:2906:1: rule__PartiturHandler__ConditionsAssignment_6 : ( rulePartiturCondition ) ;
    public final void rule__PartiturHandler__ConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2910:1: ( ( rulePartiturCondition ) )
            // InternalPartitur.g:2911:2: ( rulePartiturCondition )
            {
            // InternalPartitur.g:2911:2: ( rulePartiturCondition )
            // InternalPartitur.g:2912:3: rulePartiturCondition
            {
             before(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturCondition();

            state._fsp--;

             after(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__ConditionsAssignment_6"


    // $ANTLR start "rule__PartiturHandler__ConditionsAssignment_7_1"
    // InternalPartitur.g:2921:1: rule__PartiturHandler__ConditionsAssignment_7_1 : ( rulePartiturCondition ) ;
    public final void rule__PartiturHandler__ConditionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2925:1: ( ( rulePartiturCondition ) )
            // InternalPartitur.g:2926:2: ( rulePartiturCondition )
            {
            // InternalPartitur.g:2926:2: ( rulePartiturCondition )
            // InternalPartitur.g:2927:3: rulePartiturCondition
            {
             before(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturCondition();

            state._fsp--;

             after(grammarAccess.getPartiturHandlerAccess().getConditionsPartiturConditionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__ConditionsAssignment_7_1"


    // $ANTLR start "rule__PartiturHandler__CommandsAssignment_9"
    // InternalPartitur.g:2936:1: rule__PartiturHandler__CommandsAssignment_9 : ( rulePartiturCommand ) ;
    public final void rule__PartiturHandler__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2940:1: ( ( rulePartiturCommand ) )
            // InternalPartitur.g:2941:2: ( rulePartiturCommand )
            {
            // InternalPartitur.g:2941:2: ( rulePartiturCommand )
            // InternalPartitur.g:2942:3: rulePartiturCommand
            {
             before(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturCommand();

            state._fsp--;

             after(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__CommandsAssignment_9"


    // $ANTLR start "rule__PartiturHandler__CommandsAssignment_10_1"
    // InternalPartitur.g:2951:1: rule__PartiturHandler__CommandsAssignment_10_1 : ( rulePartiturCommand ) ;
    public final void rule__PartiturHandler__CommandsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2955:1: ( ( rulePartiturCommand ) )
            // InternalPartitur.g:2956:2: ( rulePartiturCommand )
            {
            // InternalPartitur.g:2956:2: ( rulePartiturCommand )
            // InternalPartitur.g:2957:3: rulePartiturCommand
            {
             before(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturCommand();

            state._fsp--;

             after(grammarAccess.getPartiturHandlerAccess().getCommandsPartiturCommandParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturHandler__CommandsAssignment_10_1"


    // $ANTLR start "rule__PartiturCondition__ConditionFunctionAssignment_0"
    // InternalPartitur.g:2966:1: rule__PartiturCondition__ConditionFunctionAssignment_0 : ( rulePartiturConditionFunction ) ;
    public final void rule__PartiturCondition__ConditionFunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2970:1: ( ( rulePartiturConditionFunction ) )
            // InternalPartitur.g:2971:2: ( rulePartiturConditionFunction )
            {
            // InternalPartitur.g:2971:2: ( rulePartiturConditionFunction )
            // InternalPartitur.g:2972:3: rulePartiturConditionFunction
            {
             before(grammarAccess.getPartiturConditionAccess().getConditionFunctionPartiturConditionFunctionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturConditionFunction();

            state._fsp--;

             after(grammarAccess.getPartiturConditionAccess().getConditionFunctionPartiturConditionFunctionEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__ConditionFunctionAssignment_0"


    // $ANTLR start "rule__PartiturCondition__ArgAssignment_2"
    // InternalPartitur.g:2981:1: rule__PartiturCondition__ArgAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PartiturCondition__ArgAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:2985:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:2986:2: ( RULE_STRING )
            {
            // InternalPartitur.g:2986:2: ( RULE_STRING )
            // InternalPartitur.g:2987:3: RULE_STRING
            {
             before(grammarAccess.getPartiturConditionAccess().getArgSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPartiturConditionAccess().getArgSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCondition__ArgAssignment_2"


    // $ANTLR start "rule__PartiturCommand__CommandFunctionAssignment_0"
    // InternalPartitur.g:2996:1: rule__PartiturCommand__CommandFunctionAssignment_0 : ( rulePartiturCommandFunction ) ;
    public final void rule__PartiturCommand__CommandFunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3000:1: ( ( rulePartiturCommandFunction ) )
            // InternalPartitur.g:3001:2: ( rulePartiturCommandFunction )
            {
            // InternalPartitur.g:3001:2: ( rulePartiturCommandFunction )
            // InternalPartitur.g:3002:3: rulePartiturCommandFunction
            {
             before(grammarAccess.getPartiturCommandAccess().getCommandFunctionPartiturCommandFunctionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePartiturCommandFunction();

            state._fsp--;

             after(grammarAccess.getPartiturCommandAccess().getCommandFunctionPartiturCommandFunctionEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__CommandFunctionAssignment_0"


    // $ANTLR start "rule__PartiturCommand__ArgAssignment_2"
    // InternalPartitur.g:3011:1: rule__PartiturCommand__ArgAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PartiturCommand__ArgAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3015:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3016:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3016:2: ( RULE_STRING )
            // InternalPartitur.g:3017:3: RULE_STRING
            {
             before(grammarAccess.getPartiturCommandAccess().getArgSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPartiturCommandAccess().getArgSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartiturCommand__ArgAssignment_2"


    // $ANTLR start "rule__HttpGet__UrlAssignment_2"
    // InternalPartitur.g:3026:1: rule__HttpGet__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpGet__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3030:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3031:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3031:2: ( RULE_STRING )
            // InternalPartitur.g:3032:3: RULE_STRING
            {
             before(grammarAccess.getHttpGetAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpGetAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__UrlAssignment_2"


    // $ANTLR start "rule__HttpGet__UriVariablesAssignment_4"
    // InternalPartitur.g:3041:1: rule__HttpGet__UriVariablesAssignment_4 : ( ruleUriVariables ) ;
    public final void rule__HttpGet__UriVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3045:1: ( ( ruleUriVariables ) )
            // InternalPartitur.g:3046:2: ( ruleUriVariables )
            {
            // InternalPartitur.g:3046:2: ( ruleUriVariables )
            // InternalPartitur.g:3047:3: ruleUriVariables
            {
             before(grammarAccess.getHttpGetAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUriVariables();

            state._fsp--;

             after(grammarAccess.getHttpGetAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__UriVariablesAssignment_4"


    // $ANTLR start "rule__HttpGet__HeadersAssignment_5"
    // InternalPartitur.g:3056:1: rule__HttpGet__HeadersAssignment_5 : ( ruleHttpHeader ) ;
    public final void rule__HttpGet__HeadersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3060:1: ( ( ruleHttpHeader ) )
            // InternalPartitur.g:3061:2: ( ruleHttpHeader )
            {
            // InternalPartitur.g:3061:2: ( ruleHttpHeader )
            // InternalPartitur.g:3062:3: ruleHttpHeader
            {
             before(grammarAccess.getHttpGetAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpHeader();

            state._fsp--;

             after(grammarAccess.getHttpGetAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__HeadersAssignment_5"


    // $ANTLR start "rule__HttpGet__ParamsAssignment_6"
    // InternalPartitur.g:3071:1: rule__HttpGet__ParamsAssignment_6 : ( ruleQueryParam ) ;
    public final void rule__HttpGet__ParamsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3075:1: ( ( ruleQueryParam ) )
            // InternalPartitur.g:3076:2: ( ruleQueryParam )
            {
            // InternalPartitur.g:3076:2: ( ruleQueryParam )
            // InternalPartitur.g:3077:3: ruleQueryParam
            {
             before(grammarAccess.getHttpGetAccess().getParamsQueryParamParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getHttpGetAccess().getParamsQueryParamParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__ParamsAssignment_6"


    // $ANTLR start "rule__HttpPost__UrlAssignment_2"
    // InternalPartitur.g:3086:1: rule__HttpPost__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpPost__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3090:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3091:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3091:2: ( RULE_STRING )
            // InternalPartitur.g:3092:3: RULE_STRING
            {
             before(grammarAccess.getHttpPostAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpPostAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__UrlAssignment_2"


    // $ANTLR start "rule__HttpPost__UriVariablesAssignment_4"
    // InternalPartitur.g:3101:1: rule__HttpPost__UriVariablesAssignment_4 : ( ruleUriVariables ) ;
    public final void rule__HttpPost__UriVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3105:1: ( ( ruleUriVariables ) )
            // InternalPartitur.g:3106:2: ( ruleUriVariables )
            {
            // InternalPartitur.g:3106:2: ( ruleUriVariables )
            // InternalPartitur.g:3107:3: ruleUriVariables
            {
             before(grammarAccess.getHttpPostAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUriVariables();

            state._fsp--;

             after(grammarAccess.getHttpPostAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__UriVariablesAssignment_4"


    // $ANTLR start "rule__HttpPost__HeadersAssignment_5"
    // InternalPartitur.g:3116:1: rule__HttpPost__HeadersAssignment_5 : ( ruleHttpHeader ) ;
    public final void rule__HttpPost__HeadersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3120:1: ( ( ruleHttpHeader ) )
            // InternalPartitur.g:3121:2: ( ruleHttpHeader )
            {
            // InternalPartitur.g:3121:2: ( ruleHttpHeader )
            // InternalPartitur.g:3122:3: ruleHttpHeader
            {
             before(grammarAccess.getHttpPostAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpHeader();

            state._fsp--;

             after(grammarAccess.getHttpPostAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__HeadersAssignment_5"


    // $ANTLR start "rule__HttpPost__BodyAssignment_6"
    // InternalPartitur.g:3131:1: rule__HttpPost__BodyAssignment_6 : ( ruleHttpBody ) ;
    public final void rule__HttpPost__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3135:1: ( ( ruleHttpBody ) )
            // InternalPartitur.g:3136:2: ( ruleHttpBody )
            {
            // InternalPartitur.g:3136:2: ( ruleHttpBody )
            // InternalPartitur.g:3137:3: ruleHttpBody
            {
             before(grammarAccess.getHttpPostAccess().getBodyHttpBodyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpBody();

            state._fsp--;

             after(grammarAccess.getHttpPostAccess().getBodyHttpBodyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__BodyAssignment_6"


    // $ANTLR start "rule__HttpPut__UrlAssignment_2"
    // InternalPartitur.g:3146:1: rule__HttpPut__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpPut__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3150:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3151:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3151:2: ( RULE_STRING )
            // InternalPartitur.g:3152:3: RULE_STRING
            {
             before(grammarAccess.getHttpPutAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpPutAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__UrlAssignment_2"


    // $ANTLR start "rule__HttpPut__UriVariablesAssignment_4"
    // InternalPartitur.g:3161:1: rule__HttpPut__UriVariablesAssignment_4 : ( ruleUriVariables ) ;
    public final void rule__HttpPut__UriVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3165:1: ( ( ruleUriVariables ) )
            // InternalPartitur.g:3166:2: ( ruleUriVariables )
            {
            // InternalPartitur.g:3166:2: ( ruleUriVariables )
            // InternalPartitur.g:3167:3: ruleUriVariables
            {
             before(grammarAccess.getHttpPutAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUriVariables();

            state._fsp--;

             after(grammarAccess.getHttpPutAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__UriVariablesAssignment_4"


    // $ANTLR start "rule__HttpPut__HeadersAssignment_5"
    // InternalPartitur.g:3176:1: rule__HttpPut__HeadersAssignment_5 : ( ruleHttpHeader ) ;
    public final void rule__HttpPut__HeadersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3180:1: ( ( ruleHttpHeader ) )
            // InternalPartitur.g:3181:2: ( ruleHttpHeader )
            {
            // InternalPartitur.g:3181:2: ( ruleHttpHeader )
            // InternalPartitur.g:3182:3: ruleHttpHeader
            {
             before(grammarAccess.getHttpPutAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpHeader();

            state._fsp--;

             after(grammarAccess.getHttpPutAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__HeadersAssignment_5"


    // $ANTLR start "rule__HttpPut__BodyAssignment_6"
    // InternalPartitur.g:3191:1: rule__HttpPut__BodyAssignment_6 : ( ruleHttpBody ) ;
    public final void rule__HttpPut__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3195:1: ( ( ruleHttpBody ) )
            // InternalPartitur.g:3196:2: ( ruleHttpBody )
            {
            // InternalPartitur.g:3196:2: ( ruleHttpBody )
            // InternalPartitur.g:3197:3: ruleHttpBody
            {
             before(grammarAccess.getHttpPutAccess().getBodyHttpBodyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpBody();

            state._fsp--;

             after(grammarAccess.getHttpPutAccess().getBodyHttpBodyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__BodyAssignment_6"


    // $ANTLR start "rule__HttpDelete__UrlAssignment_2"
    // InternalPartitur.g:3206:1: rule__HttpDelete__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpDelete__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3210:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3211:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3211:2: ( RULE_STRING )
            // InternalPartitur.g:3212:3: RULE_STRING
            {
             before(grammarAccess.getHttpDeleteAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpDeleteAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__UrlAssignment_2"


    // $ANTLR start "rule__HttpDelete__UriVariablesAssignment_4"
    // InternalPartitur.g:3221:1: rule__HttpDelete__UriVariablesAssignment_4 : ( ruleUriVariables ) ;
    public final void rule__HttpDelete__UriVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3225:1: ( ( ruleUriVariables ) )
            // InternalPartitur.g:3226:2: ( ruleUriVariables )
            {
            // InternalPartitur.g:3226:2: ( ruleUriVariables )
            // InternalPartitur.g:3227:3: ruleUriVariables
            {
             before(grammarAccess.getHttpDeleteAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUriVariables();

            state._fsp--;

             after(grammarAccess.getHttpDeleteAccess().getUriVariablesUriVariablesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__UriVariablesAssignment_4"


    // $ANTLR start "rule__HttpDelete__HeadersAssignment_5"
    // InternalPartitur.g:3236:1: rule__HttpDelete__HeadersAssignment_5 : ( ruleHttpHeader ) ;
    public final void rule__HttpDelete__HeadersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3240:1: ( ( ruleHttpHeader ) )
            // InternalPartitur.g:3241:2: ( ruleHttpHeader )
            {
            // InternalPartitur.g:3241:2: ( ruleHttpHeader )
            // InternalPartitur.g:3242:3: ruleHttpHeader
            {
             before(grammarAccess.getHttpDeleteAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleHttpHeader();

            state._fsp--;

             after(grammarAccess.getHttpDeleteAccess().getHeadersHttpHeaderParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__HeadersAssignment_5"


    // $ANTLR start "rule__HttpHeader__NameAssignment_1"
    // InternalPartitur.g:3251:1: rule__HttpHeader__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HttpHeader__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3255:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3256:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3256:2: ( RULE_STRING )
            // InternalPartitur.g:3257:3: RULE_STRING
            {
             before(grammarAccess.getHttpHeaderAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__NameAssignment_1"


    // $ANTLR start "rule__HttpHeader__ValueAssignment_3"
    // InternalPartitur.g:3266:1: rule__HttpHeader__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__HttpHeader__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3270:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3271:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3271:2: ( RULE_STRING )
            // InternalPartitur.g:3272:3: RULE_STRING
            {
             before(grammarAccess.getHttpHeaderAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpHeaderAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpHeader__ValueAssignment_3"


    // $ANTLR start "rule__UriVariables__ValuesAssignment_1"
    // InternalPartitur.g:3281:1: rule__UriVariables__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UriVariables__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3285:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3286:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3286:2: ( RULE_STRING )
            // InternalPartitur.g:3287:3: RULE_STRING
            {
             before(grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__ValuesAssignment_1"


    // $ANTLR start "rule__UriVariables__ValuesAssignment_2_1"
    // InternalPartitur.g:3296:1: rule__UriVariables__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__UriVariables__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3300:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3301:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3301:2: ( RULE_STRING )
            // InternalPartitur.g:3302:3: RULE_STRING
            {
             before(grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUriVariablesAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UriVariables__ValuesAssignment_2_1"


    // $ANTLR start "rule__QueryParam__NameAssignment_1"
    // InternalPartitur.g:3311:1: rule__QueryParam__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__QueryParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3315:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3316:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3316:2: ( RULE_STRING )
            // InternalPartitur.g:3317:3: RULE_STRING
            {
             before(grammarAccess.getQueryParamAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__NameAssignment_1"


    // $ANTLR start "rule__QueryParam__ValueAssignment_3"
    // InternalPartitur.g:3326:1: rule__QueryParam__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__QueryParam__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3330:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3331:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3331:2: ( RULE_STRING )
            // InternalPartitur.g:3332:3: RULE_STRING
            {
             before(grammarAccess.getQueryParamAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__ValueAssignment_3"


    // $ANTLR start "rule__HttpBody__ValueAssignment_1"
    // InternalPartitur.g:3341:1: rule__HttpBody__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HttpBody__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPartitur.g:3345:1: ( ( RULE_STRING ) )
            // InternalPartitur.g:3346:2: ( RULE_STRING )
            {
            // InternalPartitur.g:3346:2: ( RULE_STRING )
            // InternalPartitur.g:3347:3: RULE_STRING
            {
             before(grammarAccess.getHttpBodyAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttpBodyAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpBody__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000B0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000A00000000L});

}