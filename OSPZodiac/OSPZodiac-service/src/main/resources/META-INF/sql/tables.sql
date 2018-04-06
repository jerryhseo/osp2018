create table zodiac_Simulation (
	uuid_ VARCHAR(75) null,
	simulationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	title STRING null,
	webContentId LONG,
	iconId LONG,
	simulationStatus VARCHAR(75) null,
	status INTEGER,
	tasks VARCHAR(75) null
);