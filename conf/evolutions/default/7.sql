# --- !Ups

CREATE SEQUENCE SURVEY_QUESTION_PK_SEQ START WITH 1;


CREATE TABLE SURVEY_QUESTION
(
       ID              				INT8 NOT NULL,
       SURVEY_ID         			INT8 NOT NULL,
       TITLE 	       				VARCHAR(50) NOT NULL,
       CODE 	       				VARCHAR(20) NOT NULL,
       ACTION_ID					INT8 NOT NULL,
       CLOSED_BY_ACTION_ID			INT8 NULL,
       CREATED_BY      				INT8,
       CREATED_DATE    				TIMESTAMP WITH TIME ZONE,
       PRIMARY KEY (ID)
);

alter table SURVEY_QUESTION alter column id set default nextval('SURVEY_QUESTION_PK_SEQ');


ALTER TABLE SURVEY_QUESTION 
ADD 
CONSTRAINT SURVEY_QUESTION_SURVEY_ID_FK 
FOREIGN KEY (SURVEY_ID) REFERENCES SURVEY;


ALTER TABLE SURVEY_QUESTION 
ADD 
CONSTRAINT SURVEY_QUESTION_ACTION_ID_FK 
FOREIGN KEY (ACTION_ID) REFERENCES ACTIONS;

ALTER TABLE SURVEY_QUESTION 
ADD 
CONSTRAINT SURVEY_QUESTION_CLOSED_BY_ACTION_ID_FK 
FOREIGN KEY (CLOSED_BY_ACTION_ID) REFERENCES ACTIONS;


CREATE INDEX SURVEY_QUESTION_ACTION_INDEX ON SURVEY_QUESTION(ACTION_ID);
CREATE INDEX SURVEY_QUESTION_CLOSED_ACTION_INDEX ON SURVEY_QUESTION(CLOSED_BY_ACTION_ID);