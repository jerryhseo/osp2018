create table icecap_DataCollection (
	uuid_ VARCHAR(75) null,
	name VARCHAR(75) null,
	version VARCHAR(75) null,
	title STRING null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	description LONG,
	status INTEGER,
	accessMethod VARCHAR(75) null,
	collectionId LONG not null primary key,
	typeId LONG
);

create table icecap_DataCollectionLayout (
	collectionId LONG not null primary key,
	layout VARCHAR(75) null
);

create table icecap_DataEntry (
	entryId LONG not null primary key,
	collectionId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	comments STRING null
);

create table icecap_DataType (
	uuid_ VARCHAR(75) null,
	typeId LONG not null primary key,
	name VARCHAR(75) null,
	version VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	samplePath VARCHAR(75) null,
	status INTEGER,
	description STRING null
);

create table icecap_DataTypeAnalyzerLink (
	linkId LONG not null,
	typeId LONG,
	analyzerId LONG not null,
	primary key (linkId, analyzerId)
);

create table icecap_DataTypeStructure (
	typeId LONG not null primary key,
	structure VARCHAR(75) null
);