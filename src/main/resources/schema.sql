drop table if exists board cascade;
drop table if exists board_comment cascade;
drop table if exists board_detail cascade;
drop table if exists board_file cascade;
drop sequence if exists board_seq;
drop sequence if exists board_free_seq;
drop sequence if exists board_notice_seq;
drop sequence if exists board_qna_seq;

create table board
(
    board_id    bigint,
    user_id     varchar(32)  not null,
    title       varchar(256) not null,
    notice_site varchar(256),
    start_date  timestamp with time zone,
    end_date    timestamp with time zone,
    available   boolean                  default true,
    client_ip   varchar(45)  not null,
    view_count  integer                  default 0,
    update_date timestamp with time zone,
    insert_date timestamp with time zone default now(),
    constraint board_pk primary key (board_id)
);

comment on table board is '공지사항';
comment on column board.board_id is '공지사항 고유번호';
comment on column board.user_id is '사용자 아이디';
comment on column board.title is '제목';
comment on column board.notice_site is '공지사항 게시 페이지';
comment on column board.start_date is '게시 시작시간';
comment on column board.end_date is '게시 종료시간';
comment on column board.available is '사용유무, Y : 사용, N : 사용안함';
comment on column board.client_ip is '요청 IP';
comment on column board.view_count is '조회수';
comment on column board.update_date is '수정일';
comment on column board.insert_date is '등록일';

create table board_detail
(
    board_detail_id bigint,
    board_id        bigint not null,
    contents        text,
    constraint board_detail_pk primary key (board_detail_id)
);

comment on table board_detail is '공지사항 상세';
comment on column board_detail.board_detail_id is '공지사항 상세 고유번호';
comment on column board_detail.board_id is '공지사항 고유번호';
comment on column board_detail.contents is '상세 내용';

create table board_file
(
    board_file_id  bigint,
    board_id       bigint       not null,
    file_name      varchar(256) not null,
    file_real_name varchar(100) not null,
    file_path      varchar(256) not null,
    file_size      varchar(12)  not null,
    file_ext       varchar(10)  not null,
    insert_date    timestamp with time zone default now(),
    constraint board_file_pk primary key (board_file_id)
);

comment on table board_file is '공지사항 파일';
comment on column board_file.board_file_id is '공지사항 파일 고유번호';
comment on column board_file.board_id is '공지사항 고유번호';
comment on column board_file.file_name is '파일명';
comment on column board_file.file_real_name is '실제 파일명';
comment on column board_file.file_path is '파일 경로';
comment on column board_file.file_size is '파일 크기';
comment on column board_file.file_ext is '파일 확장자';
comment on column board_file.insert_date is '등록일';

create table board_comment
(
    board_comment_id bigint,
    board_id         bigint        not null,
    user_id          varchar(32)   not null,
    content          varchar(4000) not null,
    client_ip        varchar(45)   not null,
    ancestor         integer                  default 1,
    parent           integer                  default 1,
    depth            integer                  default 1,
    like_count       integer                  default 0,
    insert_date      timestamp with time zone default now(),
    constraint board_comment_pk primary key (board_comment_id)
);

comment on table board_comment is '공지사항 의견';
comment on column board_comment.board_comment_id is '공지사항 의견 고유번호';
comment on column board_comment.board_id is '공지사항 고유번호';
comment on column board_comment.user_id is '사용자 아이디';
comment on column board_comment.content is '의견 내용';
comment on column board_comment.client_ip is '요청 IP';
comment on column board_comment.ancestor is '조상';
comment on column board_comment.parent is '부모';
comment on column board_comment.depth is '깊이';
comment on column board_comment.like_count is '공감수';
comment on column board_comment.insert_date is '등록일';

create table board_free
(
    board_free_id   bigint,
    board_id        bigint,
    constraint board_free_id_pk primary key (board_free_id)
);

create table board_qna
(
    board_qna_id   bigint,
    board_id        bigint,
    constraint board_qna_id_pk primary key (board_qna_id)
);

create table board_notice
(
    board_notice_id   bigint,
    board_id        bigint,
    constraint board_notice_id_pk primary key (board_notice_id)
);



create sequence board_seq increment 1 minvalue 1 maxvalue 9999999999999999 start 1 cache 1;
create sequence board_free_seq increment 1 minvalue 1 maxvalue 9999999999999999 start 1 cache 1;
create sequence board_qna_seq increment 1 minvalue 1 maxvalue 9999999999999999 start 1 cache 1;
create sequence board_notice_seq increment 1 minvalue 1 maxvalue 9999999999999999 start 1 cache 1;