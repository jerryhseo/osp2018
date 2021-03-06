create index IX_124829FA on icebreaker_Job (groupId, jobStatus);
create index IX_2BFDD3E7 on icebreaker_Job (groupId, queueName[$COLUMN_LENGTH:75$]);
create index IX_BC51E110 on icebreaker_Job (groupId, runType[$COLUMN_LENGTH:75$]);
create index IX_68857321 on icebreaker_Job (groupId, schedulerId);
create unique index IX_C6092CED on icebreaker_Job (groupId, simulationId, jobId);
create index IX_A8C144CB on icebreaker_Job (groupId, status);
create index IX_51E4AC83 on icebreaker_Job (groupId, title[$COLUMN_LENGTH:75$]);
create index IX_99F91E80 on icebreaker_Job (groupId, userId, jobStatus);
create index IX_96A23F16 on icebreaker_Job (groupId, userId, runType[$COLUMN_LENGTH:75$]);
create index IX_C7CB5E27 on icebreaker_Job (groupId, userId, schedulerId);
create index IX_A78A0E05 on icebreaker_Job (groupId, userId, status);
create index IX_6AA0D409 on icebreaker_Job (groupId, userId, title[$COLUMN_LENGTH:75$]);
create index IX_7524D97A on icebreaker_Job (jobStatus);
create index IX_8EDA8367 on icebreaker_Job (queueName[$COLUMN_LENGTH:75$]);
create index IX_65947090 on icebreaker_Job (runType[$COLUMN_LENGTH:75$]);
create index IX_86F442A1 on icebreaker_Job (schedulerId);
create unique index IX_E707C6D on icebreaker_Job (simulationId, jobId);
create index IX_8D2EC54B on icebreaker_Job (status);
create index IX_61851C03 on icebreaker_Job (title[$COLUMN_LENGTH:75$]);
create index IX_4AEE4E00 on icebreaker_Job (userId, jobStatus);
create index IX_3A1D4E96 on icebreaker_Job (userId, runType[$COLUMN_LENGTH:75$]);
create index IX_1032ADA7 on icebreaker_Job (userId, schedulerId);
create index IX_28AF0E85 on icebreaker_Job (userId, status);
create index IX_A899C389 on icebreaker_Job (userId, title[$COLUMN_LENGTH:75$]);
create index IX_D360E19 on icebreaker_Job (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CCED46DB on icebreaker_Job (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_2E465C3E on icebreaker_OSPSchedulerEntry (groupId, name[$COLUMN_LENGTH:75$]);
create index IX_971927A5 on icebreaker_OSPSchedulerEntry (groupId, status);
create unique index IX_2794AC7E on icebreaker_OSPSchedulerEntry (name[$COLUMN_LENGTH:75$], version[$COLUMN_LENGTH:75$]);
create index IX_70D56531 on icebreaker_OSPSchedulerEntry (status);
create index IX_E9DA867F on icebreaker_OSPSchedulerEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6100A0C1 on icebreaker_OSPSchedulerEntry (uuid_[$COLUMN_LENGTH:75$], groupId);