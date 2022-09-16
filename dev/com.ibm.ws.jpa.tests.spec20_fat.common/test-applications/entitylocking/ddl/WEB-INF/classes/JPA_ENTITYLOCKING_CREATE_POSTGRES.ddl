CREATE TABLE EL10LEMMJT (ENTA INTEGER, ENTB INTEGER);
CREATE TABLE EL10LEOMJT (ENTA INTEGER, ENTB INTEGER);
CREATE TABLE EL10LockEntA (ID INTEGER NOT NULL, STRDATA VARCHAR(255), VERSION INTEGER, ENTB_MTO INTEGER, ENTB_OTO INTEGER, PRIMARY KEY (ID));
CREATE TABLE EL10LockEntB (ID INTEGER NOT NULL, STRDATA VARCHAR(255), VERSION INTEGER, PRIMARY KEY (ID));
CREATE INDEX I_L10LMJT_ELEMENT ON EL10LEMMJT (ENTB);
CREATE INDEX I_L10LMJT_ENTA ON EL10LEMMJT (ENTA);
CREATE INDEX I_L10LMJT_ELEMENT1 ON EL10LEOMJT (ENTB);
CREATE INDEX I_L10LMJT_ENTA1 ON EL10LEOMJT (ENTA);
CREATE INDEX I_L10LKNT_LOCKENTBMANYTOONE ON EL10LockEntA (ENTB_MTO);
CREATE INDEX I_L10LKNT_LOCKENTBONETOONE ON EL10LockEntA (ENTB_OTO);