create table icebug_Paper (
	uuid_ VARCHAR(75) null,
	paperId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);