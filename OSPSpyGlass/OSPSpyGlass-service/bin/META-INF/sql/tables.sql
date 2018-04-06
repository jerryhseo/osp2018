create table spyglass_ScienceApp (
	uuid_ VARCHAR(75) null,
	scienceAppId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	version VARCHAR(75) null,
	title STRING null,
	description STRING null,
	previousVersionId LONG,
	iconId LONG,
	manual STRING null,
	exeFileName VARCHAR(75) null,
	appType VARCHAR(75) null,
	runType VARCHAR(75) null,
	openStatus VARCHAR(75) null,
	status INTEGER,
	recentModifierId LONG,
	maxCpus INTEGER,
	defaultCpus INTEGER,
	statusDate DATE null,
	openLevel INTEGER,
	license VARCHAR(75) null,
	srcFileName VARCHAR(75) null
);

create table spyglass_ScienceAppInputPorts (
	scienceAppId LONG not null primary key,
	samplePath VARCHAR(75) null,
	inputPorts VARCHAR(75) null
);

create table spyglass_ScienceAppLayout (
	scienceAppId LONG not null primary key,
	layout VARCHAR(75) null
);

create table spyglass_ScienceAppLogPorts (
	scienceAppId LONG not null primary key,
	logPorts VARCHAR(75) null
);

create table spyglass_ScienceAppManager (
	scienceAppManagerId LONG not null primary key,
	userId LONG,
	createDate DATE null,
	scienceAppId LONG,
	managerId LONG
);

create table spyglass_ScienceAppOutputPorts (
	scienceAppId LONG not null primary key,
	outputPorts VARCHAR(75) null
);

create table spyglass_ScienceAppWorkflow (
	scienceAppId LONG not null primary key,
	definition VARCHAR(75) null
);