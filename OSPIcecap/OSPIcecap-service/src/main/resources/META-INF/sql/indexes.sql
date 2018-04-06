create index IX_27141C83 on icecap_DataCollection (groupId, name[$COLUMN_LENGTH:75$]);
create index IX_9377EAAA on icecap_DataCollection (groupId, status);
create index IX_F371DD3D on icecap_DataCollection (groupId, userId, name[$COLUMN_LENGTH:75$]);
create index IX_BF6864E4 on icecap_DataCollection (groupId, userId, status);
create index IX_20626CC3 on icecap_DataCollection (name[$COLUMN_LENGTH:75$], version[$COLUMN_LENGTH:75$]);
create index IX_9EEF388C on icecap_DataCollection (status);
create index IX_2800A5CF on icecap_DataCollection (typeId);
create index IX_3CBBB99F on icecap_DataCollection (userId, name[$COLUMN_LENGTH:75$]);
create index IX_DDACB0C6 on icecap_DataCollection (userId, status);
create index IX_7954241A on icecap_DataCollection (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_81EAE91C on icecap_DataCollection (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_78F7D343 on icecap_DataEntry (collectionId);

create index IX_78059DE7 on icecap_DataType (groupId, name[$COLUMN_LENGTH:75$]);
create index IX_6E0EA30E on icecap_DataType (groupId, status);
create index IX_2A0DBAA1 on icecap_DataType (groupId, userId, name[$COLUMN_LENGTH:75$]);
create index IX_BE827948 on icecap_DataType (groupId, userId, status);
create index IX_7153EE27 on icecap_DataType (name[$COLUMN_LENGTH:75$], version[$COLUMN_LENGTH:75$]);
create index IX_6728BFA8 on icecap_DataType (status);
create index IX_68A27BBB on icecap_DataType (userId, name[$COLUMN_LENGTH:75$]);
create index IX_AAEB5BE2 on icecap_DataType (userId, status);
create index IX_F1947836 on icecap_DataType (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4F299438 on icecap_DataType (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1968D237 on icecap_DataTypeAnalyzerLink (analyzerId);
create index IX_F65DBCCB on icecap_DataTypeAnalyzerLink (typeId);